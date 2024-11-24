package com.pxc.todo_rest_jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
//	public HomeController() {
//		
//	}
	
	@GetMapping("/test")
	public String test() {
		return "Test success";
	}

}
