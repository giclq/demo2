package com.example.demo.rabbitmq;

import com.example.demo.security.MyUser;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {
 
    @RabbitHandler
    public void process(MyUser u) {
        System.out.println("Receiver2  : " + u.getUsername());
    }
 
}