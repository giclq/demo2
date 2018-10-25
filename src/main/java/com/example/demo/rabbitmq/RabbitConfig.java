package com.example.demo.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
 
    @Bean
    public Queue Queue() {
        return new Queue("key666");

    }
    @Bean
    public Queue Queue2() {
        return new Queue("object");

    }
 
}