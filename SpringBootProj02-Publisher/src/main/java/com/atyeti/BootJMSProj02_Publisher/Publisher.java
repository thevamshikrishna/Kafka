package com.atyeti.BootJMSProj02_Publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Publisher implements CommandLineRunner {

    @Autowired
    private JmsTemplate template;

    @Override
    public void run(String... args) throws Exception {
        //template.send("tcp1",ses->ses.createTextMessage("from the Sender::"+new Date()));
        template.convertAndSend("Vamshi", "Hello Subscriber!");
        System.out.println("Sender has Sent the Message");
    }
}
