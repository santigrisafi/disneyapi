package com.disney.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.disney.pojo")
@EnableJpaRepositories("com.disney.repositories")
@ComponentScan(basePackages = {"com.disney.controllers", "com.disney.services"})
public class DisneyApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DisneyApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Disney API Version 1.0");
	}

}
