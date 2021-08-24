package br.org.generation.hello31.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello1")
public class Atividade1Controller {
	
	@GetMapping
	public String Hello1() {
		return "Habilidades: Atenção aos detalhes </br>"
				+ "Mentalidade: Persistencia";
	}
	

}
