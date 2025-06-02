package com.otp.sender.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.otp.sender.entity.Mail;
import com.otp.sender.services.MailService;

@Controller
public class MailController {
	
	@Autowired
	MailService service;
	
	@PostMapping("/send")
	public String send(@ModelAttribute Mail mail) {
		service.sendMail(mail);
		return "validate";
	}
	

}