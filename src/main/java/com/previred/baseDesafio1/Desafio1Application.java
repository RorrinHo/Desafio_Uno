package com.previred.baseDesafio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = { "com.previred" })
public class Desafio1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

}
