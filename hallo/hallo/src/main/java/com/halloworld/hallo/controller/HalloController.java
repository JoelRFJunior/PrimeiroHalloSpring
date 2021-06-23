package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requisitos")
public class HalloController {
	
	@GetMapping("/saudacao")
	public String hello() {
		return "hallo Generation!!!";
	}
	
	@GetMapping("/mentalidades")
	public String mentalidades() {
		return "as mentalidades utilizadas foram persistência e orientação aos detalhes";
	}
	
	@GetMapping("/motivos")
	public String motivos() {
		return "O motivo da aprendizagem da semana é ganhar conhecimento para ajudar no projeto integrado "; 
	}
	
	
	
	
}

