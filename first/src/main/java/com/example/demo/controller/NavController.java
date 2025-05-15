package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/")
	public String openHome() {
		return "index";
	}
	
	@GetMapping("/java")
	public String openJava() {
		return "Java";
	}
	
	@GetMapping("/python")
	public String openPython() {
		return "Python";
	}
}
