package com.example.demo.api;



import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {
	
     public static Logger logger=(Logger) LoggerFactory.getLogger(SpringJenkinsApplication.class);
     
     @PostConstruct
      public void intt() {
    	  logger.info("Aplicaiton Strted");
      }
        public static void main(String[] args) {
        	logger.info("Before Starting application");
         SpringApplication.run(SpringJenkinsApplication.class, args);
        }

}
