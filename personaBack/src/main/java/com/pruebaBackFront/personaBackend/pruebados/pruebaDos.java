package com.pruebaBackFront.personaBackend.pruebados;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pruebaDos {
	
	@GetMapping("/saludos")
	public String pruebaMundo() {
		return "hola mundo desde la apli :P";
	}

}
