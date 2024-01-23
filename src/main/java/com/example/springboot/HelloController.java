package com.example.springboot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String hello() {
		return "Greetings from Spring Boot!";
	}

}
