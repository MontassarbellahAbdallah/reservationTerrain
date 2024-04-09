package com.terrain.reservationTerrain.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailServiceImpl implements EmailService {
    @Autowired
    private JavaMailSender emailSender;
    @Autowired
    private JavaMailSender javaMailSender;
    public void EmailService(JavaMailSender javaMailSender){
        this.javaMailSender=javaMailSender;
    }
    @Async
    public void sendEmail(SimpleMailMessage email){
        javaMailSender.send(email);
    }
}
