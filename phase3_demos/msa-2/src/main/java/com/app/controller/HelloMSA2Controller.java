package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMSA2Controller {

	
	@GetMapping("/msa2")
	public String helloMSA2() {
		return "<h1>Hello from MSA-2</h1>";
	}
	
	@GetMapping("/")
	public String welcome() {
		return "<h1>Welcome to / with MSA2 this time.....</h1>";
	}
}
