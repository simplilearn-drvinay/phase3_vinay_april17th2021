package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMSA3Controller {

	@GetMapping("/msa3")
	public String helloMSA2() {
		return "<h1>Hello from MSA-3</h1>";
	}

	@GetMapping("/")
	public String welcome() {
		return "<h1>Welcome to / with MSA3 this time.....</h1>";
	}

}
