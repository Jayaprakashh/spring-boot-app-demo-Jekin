package com.java4s.app;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  


public class HomeController {
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot ";
	}
	
	
	@RequestMapping("/hello")  
    public String hello(){  
        return"Hello!! SpringBoot";  
	 

	}

}

//https://www.java4s.com/spring-boot-tutorials/spring-boot-creating-a-restful-web-service-example/
