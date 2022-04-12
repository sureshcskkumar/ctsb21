package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	Environment env;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("OS: "+env.getProperty("OS"));
		System.out.println("MAVEN_HOME: "+env.getProperty("MAVEN_HOME"));
		System.out.println("USERNAME: "+env.getProperty("USERNAME"));
		System.out.println("abc: "+env.getProperty("abc"));
	}

}
