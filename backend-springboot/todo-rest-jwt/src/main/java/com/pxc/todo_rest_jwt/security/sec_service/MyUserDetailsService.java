package com.pxc.todo_rest_jwt.security.sec_service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pxc.todo_rest_jwt.security.sec_dao.AccountRepo;
import com.pxc.todo_rest_jwt.security.sec_model.Account;
import com.pxc.todo_rest_jwt.security.sec_model.AccountPrincipal;

@Service
public class MyUserDetailsService implements UserDetailsService{
	private AccountRepo accountRepo;
	
	public MyUserDetailsService(AccountRepo accountRepo) {
		this.accountRepo = accountRepo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accountRepo.findByUsername(username).get();
		return new AccountPrincipal(account);
	}

}
