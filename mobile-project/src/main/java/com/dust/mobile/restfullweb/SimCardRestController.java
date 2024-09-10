/*
 * Copyright (C) Mathieu Champlon, Tout droits réservés 
 *  
 */
package com.dust.mobile.restfullweb;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dust.mobile.entities.Simcard;
import com.dust.mobile.service.SimCardService;
import com.dust.mobile.service.SimCardServiceImpl;

/**
 * @author Mathieu Champlon
 * @version 5 Spring Boot 4
 * @apiNote Fonctionne avec l'annotation Spring boot application et l'argument scanBasePackages
 */
@RestController
@RequestMapping("/api")
public class SimCardRestController {
	
	
	@Autowired
	private SimCardService simCarService;
	
/**
	 * @param simCarService
	 */
	@GetMapping("/simcards")
	public List<Simcard> liste(){
		
		return simCarService.getAllSimCard();
	}
	@PostMapping("simcards/{sim}")
	public Simcard addSimcard (@RequestBody Simcard sim) {
		Simcard card= new Simcard();

		return simCarService.addSimcard(card);
	}
	@GetMapping("simcards/{sim}")
	public Optional<Simcard> findById(@PathVariable (name="sim") String idsim) {
		
		return simCarService.findById(idsim);
	}
	@DeleteMapping("/delete/{iccid}")
	public String deleteById(@PathVariable(name ="iccid") String iccid) {
		simCarService.delSimcard(iccid);
		return "<html> " + "<title>" + "Suppression" + "</title>" + 
		 "<body><h1>"
		 +" <br/> Client; supprime;: "+ iccid
		 + "</h1></body>" + "</html> "; 
		
	}
	
}
