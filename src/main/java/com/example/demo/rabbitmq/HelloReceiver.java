package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "key666")
public class HelloReceiver {

    @RabbitHandler
    public void process(String str) {
        System.out.println("Receiver2  : " + str);
    }

}