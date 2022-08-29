//write a simple Microservice application using Eureka server and Eureka Client

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class ExamEurekaClient29082022Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamEurekaClient29082022Application.class, args);
	}

	
	@GetMapping
	public String hi() {
		return "Eureka Client Application.......";
	}
}
