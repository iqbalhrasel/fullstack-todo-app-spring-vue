package com.pxc.todo_rest_jwt.security.sec_dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pxc.todo_rest_jwt.security.sec_model.Account;

public interface AccountRepo extends JpaRepository<Account, Integer>{
	Optional<Account> findByUsername(String username);

}
