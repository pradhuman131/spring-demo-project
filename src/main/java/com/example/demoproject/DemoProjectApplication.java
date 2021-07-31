package com.example.demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoProjectApplication {

	@GetMapping("/")
	public String sayHello() {
		return "Welcome back!!";
	}

	@GetMapping("/message/{input}")
	public String sayHelloName (@PathVariable String input) {
		return "Welcome " + input;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}

}
