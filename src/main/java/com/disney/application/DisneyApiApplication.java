package com.disney.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.disney.pojo")
@ComponentScan(basePackageClasses = DisneyApiApplication.class)
public class DisneyApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DisneyApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Disney API Version 1.0");
	}

}
