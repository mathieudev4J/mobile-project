/*
 * Copyright (C) Mathieu Champlon, Tout droits réservés 
 *  
 */
package com.dust.mobile.restfullweb;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

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
	public ResponseEntity<Iterable<Simcard>> listeAll(){
	try {
		return new ResponseEntity<Iterable<Simcard>> (simCarService.getAllSimCard() ,HttpStatus.OK);
	}
	catch(Exception e ) {
		return new ResponseEntity<Iterable<Simcard>>(HttpStatus.BAD_REQUEST);
		
	}
	}
	@PostMapping("simcards/{sim}")
	public ResponseEntity<Simcard>  addSimcard(@RequestBody Simcard sim) {
		try {
			return new ResponseEntity<Simcard>(simCarService.addSimcard(sim), HttpStatus.OK);
		}
    catch(Exception e) {
	return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
}
	}
	@GetMapping("simcards/{id}")
	public Optional <Simcard> findById(@PathVariable (name="id") String idsim) {
		
		return simCarService.findAllById(idsim);

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
