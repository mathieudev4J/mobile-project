package com.dust.mobile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dust.mobile.entities.Simcard;
import com.dust.mobile.repositories.SimcardRepository;

/**
 * @author Mathieu Champlon
 * @version 5 Spring Boot 4
 * @apiNote Fonctionne avec l'annotation Spring boot application et l'argument scanBasePackages
 */
@Service
public interface SimCardService{

	public Simcard saveSimcard (Simcard sim);
	
	public List<Simcard> getAllSimCard();
	
	public Simcard addSimcard(Simcard sim);
	
	public void delSimcard(String sim);
	
	public Optional<Simcard> findById(String sim);
	
	
	
}
