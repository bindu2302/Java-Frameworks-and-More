package com.otp.sender.services;

import com.otp.sender.entity.Mail;

public interface MailService {
	void sendMail(Mail mail);
}