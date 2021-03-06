package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;

@SpringBootApplication
@EnableEmailTools
public class SpringBootFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFinderApplication.class, args);
	}
}
