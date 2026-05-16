package com.leonela.universities_service;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class UniversitiesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversitiesServiceApplication.class, args);
	}

}
