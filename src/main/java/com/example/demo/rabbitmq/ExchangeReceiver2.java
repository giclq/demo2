package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class ExchangeReceiver2 {

    @RabbitHandler
    public void process(String str) {
        System.out.println("topic.messages  : " + str);
    }

}