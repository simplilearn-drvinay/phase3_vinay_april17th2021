package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMSA1Controller {

	
	@GetMapping("/msa1")
	public String helloMSA1() {
		return "<h1>Hello from MSA-1</h1>";
	}
	
	@GetMapping("/")
	public String welcome() {
		return "<h1>Welcome to / with MSA1 this time.....</h1>";
	}
}
