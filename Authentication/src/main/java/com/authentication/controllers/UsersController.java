package com.authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String signUp(@ModelAttribute Users user, Model m) {
		String username = user.getUsername();
		boolean usernameExist = service.usernameExist(username);
		
		if(usernameExist == false) {
			service.signUp(user);
			m.addAttribute("msg","User registered successfully!");
			return "sign_in";
		}	
		else {
			m.addAttribute("msg","User already exist!");
		    return "sign_up";
		}
	}
	
	@PostMapping("/signIn")
	public String signIn(@ModelAttribute UserLoginData data, Model m) {
		
		Users dbUser = service.getUser(data.getUsername());
		if(dbUser != null) {
			if(data.getPassword().equals(dbUser.getPassword()))
				return "success";
		}
		m.addAttribute("errorMsg","Wrong credentails, try again!");
	    return "sign_in";
	}
	
}
