package com.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeyController {
	@GetMapping("/hey")
	public String helloFromGet() {
		return "HEY & Welcome to Spring Boot App with RESTful services and hello from GET method";
	}
	
	@PostMapping("/hey")
	public String helloFromPost() {
		return "HEY & Welcome to Spring Boot App with RESTful services and hello from POST method";
	}
	
	@PutMapping("/hey")
	public String helloFromPut() {
		return "HEY & Welcome to Spring Boot App with RESTful services and hello from PUT method";
	}
	
	@DeleteMapping("/hey")
	public String helloFromDelete() {
		return "HEY & Welcome to Spring Boot App with RESTful services and hello from DELETE method";
	}
}
