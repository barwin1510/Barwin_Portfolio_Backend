package com.project.barwinPortfolioBackend.controller;

import com.project.barwinPortfolioBackend.model.EmailRequestDTO;
import com.project.barwinPortfolioBackend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mail")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<String> sendContactForm(@RequestBody EmailRequestDTO request) {
        String body = "Name: " + request.getName() + "\n"
                + "Email: " + request.getEmail() + "\n\n"
                + request.getMessage();

        emailService.sendEmail("barwin15102001@gmail.com", request.getSubject(), body, request.getEmail());
        return ResponseEntity.ok("Email sent successfully!");
    }

}


