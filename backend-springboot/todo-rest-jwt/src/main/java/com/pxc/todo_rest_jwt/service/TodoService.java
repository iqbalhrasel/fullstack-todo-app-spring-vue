package com.pxc.todo_rest_jwt.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pxc.todo_rest_jwt.dao.TodoRepo;
import com.pxc.todo_rest_jwt.model.Todo;
import com.pxc.todo_rest_jwt.security.sec_service.TokenService;

@Service
public class TodoService {
	
	private TokenService tokenService;
	private TodoRepo todoRepo;
	
	public TodoService(TokenService tokenService, TodoRepo todoRepo) {
		this.tokenService = tokenService;
		this.todoRepo = todoRepo;
	}

	public List<Todo> getAllTodosOfUser() {		
		return todoRepo.findByAccountUsernameOrderByIdDesc(tokenService.jwtUsername());
	}

	public Todo createTodo(Todo todo) {
		todo.setAccountUsername(tokenService.jwtUsername());
		todo.setCreationDate(LocalDate.now());
		
		Todo newTodo = todoRepo.save(todo);
		return newTodo;
	}

	public int updateTodo(Todo todo) {
		Optional<Todo> findTodo = todoRepo.findById(todo.getId());
		if(findTodo.isPresent()) {
			Todo updateTodo = findTodo.get();
			updateTodo.setDescription(todo.getDescription());
			updateTodo.setTargetDate(todo.getTargetDate());
			updateTodo.setDone(todo.isDone());
			todoRepo.save(updateTodo);
			return 1;
		}
		return -1;
	}

	public int deleteTodoById(int id) {
		Optional<Todo> todo = todoRepo.findById(id);
		if(todo.isPresent()) {
			todoRepo.delete(todo.get());
			return 1;
		}
		return -1;
	}

}
