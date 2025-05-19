package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/message")
	public String greet(Model m) {
		m.addAttribute("greeting", "good night");
		return "message";
	}
}
