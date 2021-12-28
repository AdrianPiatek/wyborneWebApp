package com.example.wyborne.services;

import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Map;
import java.util.Properties;


@Service
@AllArgsConstructor
public class OrderService {

    public void showAll(Map<String, ?> map) {
        System.out.println("\n");
        System.out.println("List of dishes: " + map.get("dishes"));
        System.out.println("Name:           " + map.get("name"));
        System.out.println("E-mail:         " + map.get("email"));
        System.out.println("\n");
    }


    public void sendMail(Map<String, ?> map) {

        String to = (String) map.get("email");
        String content = "Hello, " + map.get("name") + "!\n" +
                         "Thank You for the order. \n";







        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@angryduck.com");
        message.setTo(to);
        message.setSubject("Your Order");
        message.setText(content);


        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("rozgniewanakaczka@gmail.com");
        mailSender.setPassword("1q2w3e4r=");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");


        mailSender.send(message);



    }










}
