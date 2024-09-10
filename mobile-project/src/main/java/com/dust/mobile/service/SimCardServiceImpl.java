/*
 * Copyright (C) Mathieu Champlon, Tout droits réservés 
 *  
 */
package com.dust.mobile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dust.mobile.entities.Simcard;
import com.dust.mobile.repositories.SimcardRepository;

/**
 * @author Mathieu Champlon
 * @version 5 Spring Boot 4
 * @apiNote Fonctionne avec l'annotation Spring boot application et l'argument scanBasePackages
 */
@Component
@Transactional
public class SimCardServiceImpl implements SimCardService {

	private SimcardRepository simcardRepository;
	
	public SimCardServiceImpl(SimcardRepository simcardRepository) {
		this.simcardRepository=simcardRepository;
	}
	@Override
	public Simcard saveSimcard(Simcard sim) {
		
		Simcard simcard=simcardRepository.save(sim);
		// TODO Auto-generated method stub
		return simcard;
	}

	@Override
	public List<Simcard> getAllSimCard() {
		// TODO Auto-generated method stub
		
		return simcardRepository.findAll();
	}
	@Override
	public Simcard addSimcard(Simcard sim) {
		 if (sim == null) {
		// TODO Auto-generated method stub
		return simcardRepository.save(sim);
	}
		 else {
			 return null ;
		 }
	}
	@Override
	public void delSimcard(String idSim) {
		// TODO Auto-generated method stub
		 simcardRepository.deleteById(idSim);
		 
	}
	@Override
	public Optional<Simcard> findById(String sim) {
		// TODO Auto-generated method stub
		
		return simcardRepository.findById(sim);
	}

}
