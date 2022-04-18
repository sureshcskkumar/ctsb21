package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"path"})
public class Application {
	
//	org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration o;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
