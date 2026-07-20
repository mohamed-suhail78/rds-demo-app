package com.example.RDS_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RdsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdsDemoApplication.class, args);
	}

}
