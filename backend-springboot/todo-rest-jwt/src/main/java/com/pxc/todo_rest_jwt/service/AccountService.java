package com.pxc.todo_rest_jwt.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pxc.todo_rest_jwt.security.sec_dao.AccountRepo;
import com.pxc.todo_rest_jwt.security.sec_model.Account;

@Service
public class AccountService {
	private AccountRepo accountRepo;
	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

	public AccountService(AccountRepo accountRepo) {
		this.accountRepo = accountRepo;
	}

	public int createNewUser(Account account) {
		Account checkAccount = accountRepo.findByUsername(account.getUsername()).orElse(null);
		if(checkAccount == null) {
			account.setPassword(passwordEncoder.encode(account.getPassword()));
			accountRepo.save(account);
			return 1;
		}
		return -1;
	}

	public String findFullNameByUsername(String username) {
		Account account = accountRepo.findByUsername(username).get();
		return account.getFullName();
	}

}
