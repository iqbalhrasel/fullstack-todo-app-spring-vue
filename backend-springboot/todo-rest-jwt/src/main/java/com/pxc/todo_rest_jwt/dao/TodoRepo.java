package com.pxc.todo_rest_jwt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pxc.todo_rest_jwt.model.Todo;

public interface TodoRepo extends JpaRepository<Todo, Integer> {
	List<Todo> findByAccountUsernameOrderByIdDesc(String accountUsername);

}
