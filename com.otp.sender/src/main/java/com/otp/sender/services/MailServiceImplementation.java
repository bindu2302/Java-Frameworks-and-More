package com.otp.sender.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otp.sender.repositories.MailRepo;

@Service
public class MailServiceImplementation 
	implements MailService{
	
	@Autowired
	MailRepo repo;

}
