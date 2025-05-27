package com.authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.authentication.entities.UserLoginData;
import com.authentication.entities.Users;
import com.authentication.services.UserService;

@Controller
public class UsersController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/open_signUp")
	public String open_signUp() {
		return "sign_up";
	}
	
	@GetMapping("/open_signIn")
	public String open_signIn() {
		return "sign_in";
	}
	
	
	@PostMapping("/signUp")
	public String signUp(@ModelAttribute Users user) {
		String username = user.getUsername();
		boolean usernameExist = service.usernameExist(username);
		if(usernameExist == false) 
			service.signUp(user);
		else
			System.out.println("User already exist!");
		return "index";
	}
	
	@PostMapping("/signIn")
	public String signIn(@ModelAttribute UserLoginData data) {
		
		Users dbUser = service.getUser(data.getUsername());
		if(dbUser != null) {
			if(data.getPassword().equals(dbUser.getPassword()))
				return "success";
		}
		return "fail";
	}
	
}
