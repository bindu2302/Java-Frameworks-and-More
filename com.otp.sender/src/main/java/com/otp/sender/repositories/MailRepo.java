package com.otp.sender.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otp.sender.entity.Mail;

public interface MailRepo 
			extends JpaRepository<Mail,Integer> {

}
