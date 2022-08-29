//write a simple Microservice application using Eureka server and Eureka Client

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExamEurekaServer29082022Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamEurekaServer29082022Application.class, args);
	}

}
