package com.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
//	JpaRepositoriesAutoConfiguration obj;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("App is working");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
