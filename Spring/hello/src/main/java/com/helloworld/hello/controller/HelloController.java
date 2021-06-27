package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String hello() {
		return "Meus objetivos de aprendizagem para a semana 6 são: entender a dinâmica de funcionamento "
				+ "do spring boot, colocá-lo em prática para adquirir conhecimento e desenvolver meu projeto integrador";
	}
}
