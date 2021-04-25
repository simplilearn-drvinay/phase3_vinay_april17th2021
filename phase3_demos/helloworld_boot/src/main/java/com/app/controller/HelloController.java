package com.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String helloFromGet() {
		return "Hello & Welcome to Spring Boot App with RESTful services and hello from GET method";
	}
	
	@PostMapping("/")
	public String helloFromPost() {
		return "Hello & Welcome to Spring Boot App with RESTful services and hello from POST method";
	}
	
	@PutMapping("/")
	public String helloFromPut() {
		return "Hello & Welcome to Spring Boot App with RESTful services and hello from PUT method";
	}
	
	@DeleteMapping("/")
	public String helloFromDelete() {
		return "Hello & Welcome to Spring Boot App with RESTful services and hello from DELETE method";
	}
}
