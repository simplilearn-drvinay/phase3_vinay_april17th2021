package com.app.service.impl;

import javax.jws.WebService;

import com.app.service.HelloService;

@WebService(endpointInterface = "com.app.service.HelloService")
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello and Welcome to SOAP Web Services using Java's JAX-WS";
	}

	@Override
	public String sayHelloByName(String name) {
		// TODO Auto-generated method stub
		 return "Hello "+name+" and Welcome to SOAP Web Services using Java's JAX-WS";
	}

}
