package com.example.demo.api;



import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {
	
      static Logger logger=(Logger) LoggerFactory.getLogger(SpringJenkinsApplication.class);
        public static void main(String[] args) {
        	logger.info("Before Starting application");
         SpringApplication.run(SpringJenkinsApplication.class, args);
         logger.debug("Starting my application in debug with {} args", args.length);
         logger.info("Starting my application with {} args.", args.length);  
        }

}
