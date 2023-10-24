package com.paulo.docker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {

	@GetMapping("/")
	public String getHome() {
		return "Spring Boot Home";
	}
	
	@GetMapping("/msg")
	public String getMessage() {
		return "Hello, this is a message example";
	}
}
