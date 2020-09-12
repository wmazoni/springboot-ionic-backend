package com.webvision.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.webvision.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
