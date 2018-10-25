package com.example.demo.rabbitmq;

import com.example.demo.security.MyUser;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HelloSender {
 
    @Autowired
    private AmqpTemplate rabbitTemplate;
 
    public void send(int i) {
        String context = "hi " + new Date()+" "+i;
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("key666", context);
    }
    public void sendobj() {
        MyUser myUser = new MyUser();
        myUser.setUsername("clq");
        this.rabbitTemplate.convertAndSend("object", myUser);
    }


    public void send1() {
        String context = "hi, i am message 1";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.message", context);
    }

    public void send2() {
        String context = "hi, i am messages 2";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.messages", context);
    }
}