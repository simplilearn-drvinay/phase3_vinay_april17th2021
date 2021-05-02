package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloZuulController {

	@GetMapping("/")
	public String sayHelloZuul() {
		return "<h1>Hello from ZUUL Proxy API Gateway</h1>";
	}
}
