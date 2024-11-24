package com.pxc.todo_rest_jwt.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pxc.todo_rest_jwt.model.Todo;
import com.pxc.todo_rest_jwt.service.TodoService;

@RestController
@RequestMapping("api/todos")
public class TodoController {
	
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Todo>> allTodos(){
		List<Todo> fetchTodosByUser = todoService.getAllTodosOfUser();
		return new ResponseEntity<>(fetchTodosByUser, HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Todo> createTodo(@RequestBody Todo todo){
		Todo getNewtodo = todoService.createTodo(todo);		
		return new ResponseEntity<>(getNewtodo, HttpStatus.OK);
	}
	
	@PutMapping("/")
	public ResponseEntity<Integer> updateATodo(@RequestBody Todo todo){
		int updateResponse = todoService.updateTodo(todo);
		if(updateResponse > 0)
			return new ResponseEntity<>(HttpStatus.OK);
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> deleteATodo(@PathVariable int id){
		int deleteResponse = todoService.deleteTodoById(id);
		if(deleteResponse > 0)
			return new ResponseEntity<>(HttpStatus.OK);
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

}
