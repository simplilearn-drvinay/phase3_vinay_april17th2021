package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //@Configuration + @ComponentScan + @EnableWebMVC
public class HelloworldBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldBootApplication.class, args);
	}

}
