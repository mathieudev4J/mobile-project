/*
 * Copyright (C) Mathieu Champlon, Tout droits réservés 
 *  
 *  
 */
package com.dust.mobile;

import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.dust.mobile.service.SimCardService;

/**
 * @author Mathieu Champlon
 * @version 5 Spring Boot 4
 * @apiNote Fonctionne avec l'annotation Spring boot application et l'argument scanBasePackages
 * 
 */
@SpringBootApplication(scanBasePackages  = "com.dust.mobile")
public class MobileProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileProjectApplication.class, args);
		
	}
	/*@Bean 
	CommandLineRunner commandLineRunner(SimCardService simCardService) {
		return commandLineRunner(simCardService);
			
		}*/
	}
	


