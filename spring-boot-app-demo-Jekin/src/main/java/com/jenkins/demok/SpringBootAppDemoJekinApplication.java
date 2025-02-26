package com.jenkins.demok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootAppDemoJekinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppDemoJekinApplication.class, args);
	}
	
	@RestController
	@RequestMapping("/api")
	class HelloController {
	    @GetMapping("/hello")
	    public String hello() {
	        return "Hello from Spring Boot!";
	    }
	}
}
