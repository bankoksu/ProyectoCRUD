package com.pruebaBackFront.personaBackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaBackFront.personaBackend.model.Pais;
import com.pruebaBackFront.personaBackend.service.PaisService;

@RestController
@RequestMapping("/pais")
public class PaisREST {
	
	@Autowired
	private PaisService paisService;
	
	
	@GetMapping
	public ResponseEntity<List<Pais>> getAllPaises (){
		return ResponseEntity.ok(paisService.findAll());
	}

}