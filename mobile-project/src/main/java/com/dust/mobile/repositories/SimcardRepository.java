/*
 * Copyright (C) Mathieu Champlon, Tout droits réservés 
 *  
 *  
 */
package com.dust.mobile.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dust.mobile.entities.Simcard;

/**
 * @author Mathieu Champlon
 * @version 5 Spring Boot 4
 * @apiNote Fonctionne avec l'annotation Spring boot application et l'argument scanBasePackages
 */
public interface SimcardRepository extends JpaRepository<Simcard, String>{

	
	
	

}
