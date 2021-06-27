package br.com.olamundo.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olaMundo")
public class OlaMundoController {
	@GetMapping
	public String ola() {
		return "Mentalidades: persistência e mentalidade de crescimento / Habilidades:Atenção aos detalhes";
	}

}
