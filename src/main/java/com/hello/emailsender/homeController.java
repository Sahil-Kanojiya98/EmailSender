package com.hello.emailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class homeController {

    @Autowired
    private MailSenderService mailSenderService;

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody EmailRequest request) {
        mailSenderService.sendSimpleMessage(request.getTo(), request.getSubject(), request.getText());
        return "Email sent successfully!";
    }
}

