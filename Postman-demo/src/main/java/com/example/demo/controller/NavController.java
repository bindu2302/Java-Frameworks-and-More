package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NavController {
	
	@GetMapping("/greet")
	public String greet() {
		System.out.println("request received");
		return "Have a Good Day!";
	}
		
		@GetMapping("/acceptData")
	    public String acceptData(@RequestParam String data) {
	        System.out.println("Received data: " + data);
	        return "Data received: " + data;
	    }
}
