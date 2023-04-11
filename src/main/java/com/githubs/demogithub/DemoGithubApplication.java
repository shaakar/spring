package com.githubs.demogithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoGithubApplication {

	@GetMapping("/hello")
	public String hello(){
		return "springboot hello world java rest-api" ;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoGithubApplication.class, args);
	}

}


