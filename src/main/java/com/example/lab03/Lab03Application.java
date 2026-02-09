package com.example.lab03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lab03Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab03Application.class, args);
	}

	@GetMapping("/")	
	public String hello() {
		return "Hello, World!";
	}

	@GetMapping("/hello")
	public String helloAgain() {
		return "Hello again!";
	}

}
