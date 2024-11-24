package com.pxc.todo_rest_jwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pxc.todo_rest_jwt.model.AccountDto;
import com.pxc.todo_rest_jwt.security.sec_model.Account;
import com.pxc.todo_rest_jwt.security.sec_service.TokenService;
import com.pxc.todo_rest_jwt.service.AccountService;

@RestController
public class AccountController {
	private AccountService accountService;
	private AuthenticationManager authManager;
	private TokenService tokenService;
	
	public AccountController(AccountService accountService, AuthenticationManager authManager,
			TokenService tokenService) {
		this.accountService = accountService;
		this.authManager = authManager;
		this.tokenService = tokenService;
	}
	
	@PostMapping("register")
	public ResponseEntity<String> userRegister(@RequestBody Account account){
		int registerResponse = accountService.createNewUser(account);
		if(registerResponse < 0) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("created", HttpStatus.OK);
	}
	
	@PostMapping("login")
	public ResponseEntity<AccountDto> loginUser(@RequestBody Account account){
		Authentication authentication = authManager
				.authenticate(new UsernamePasswordAuthenticationToken(account.getUsername(), account.getPassword()));
		
		if(authentication.isAuthenticated()) {
			String generateToken = tokenService.generateToken(authentication);
			String getFullName = accountService.findFullNameByUsername(authentication.getName());
			
			AccountDto accountDto = new AccountDto(getFullName, generateToken);			
			return new ResponseEntity<>(accountDto, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

}
