package com.example.demoJenkinsCiCd;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoJenkinsCiCdApplication {
	private static final Logger logger= LoggerFactory.getLogger(DemoJenkinsCiCdApplication.class);


	@PostConstruct
	public void init(){
		logger.info("hii from post construct init method");

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsCiCdApplication.class, args);
		logger.info("hii from main method");
		System.out.println("hello");
	}


}
