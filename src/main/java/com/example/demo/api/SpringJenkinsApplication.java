package com.example.demo.api;


import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.logging.LoggerGroup;
import org.springframework.boot.logging.LoggingSystemFactory;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {
    static final org.slf4j.Logger log = 
            LoggerFactory.getLogger(SpringJenkinsApplication.class);
      
        public static void main(String[] args) {
         log.info("Before Starting application");
         SpringApplication.run(SpringJenkinsApplication.class, args);
         log.debug("Starting my application in debug with {} args", args.length);
         log.info("Starting my application with {} args.", args.length);  
        }

}
