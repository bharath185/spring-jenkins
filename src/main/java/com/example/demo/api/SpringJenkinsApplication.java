package com.example.demo.api;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
public static org.slf4j.Logger Logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	public void intt() {
		Logger.info("Application Started....");
	}
	

	public static void main(String[] args) {
		Logger.info("Application Executed....");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
