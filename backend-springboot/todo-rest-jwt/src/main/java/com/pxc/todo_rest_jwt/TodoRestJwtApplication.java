package com.pxc.todo_rest_jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.pxc.todo_rest_jwt.security.jwt.RsaKeyProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class TodoRestJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoRestJwtApplication.class, args);
	}

}
