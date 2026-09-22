package com.web.springbootmailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.springbootmailsender.service.EmailService;

@RestController
public class MailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendMail")
    public String sendMail(@RequestParam String to,@RequestParam String subject,
    		@RequestParam String text) {
        emailService.sendMail(
            to,
            subject,
            text);
        return "Mail Sent Successfully! to: " + to;
    }
}
