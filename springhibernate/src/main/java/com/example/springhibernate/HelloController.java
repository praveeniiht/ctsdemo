package com.example.springhibernate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/test")
	public String test() {
		return "Hello";
	}

	@PostMapping("/test1")
	public String test1() {
		return "bye";
	}
}
