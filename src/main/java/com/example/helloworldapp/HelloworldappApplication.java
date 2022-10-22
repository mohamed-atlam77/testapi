package com.example.helloworldapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class HelloworldappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldappApplication.class, args);
	}

	@GetMapping("/hello")
	public List<String> hello(){
		return List.of("Hello", "World");
	}

}
