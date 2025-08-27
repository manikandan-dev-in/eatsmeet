package com.wak.eatsmeet.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    //send validation mail to user gmail
    public void sendValidateLinkToUser(String email) throws MessagingException {
        String validationLink = "http://localhost:8080/api/auth/validate?token=";

        String htmlMsg = "<h2>Email Verification</h2>"
                + "<p>Click the link below to validate your email:</p>"
                + "<a href=\"" + validationLink + "\">Validate Email</a>";

        MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom("flexicraftcon@gmail.com");
        helper.setTo(email);
        helper.setSubject("Validate Your Account");

        helper.setText(htmlMsg, true);

        mailSender.send(message);
    }
}
