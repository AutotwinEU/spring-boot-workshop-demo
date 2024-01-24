package com.example.springboot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HelloController {

	@GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String hello() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> health() {
		return Collections.singletonMap("status", "OK");
	}

}
