package com.example.demo.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
//https://blog.csdn.net/ztx114/article/details/78410727  fanout代码未写
@Controller
public class RabbitMqHelloTest {
 
    @Autowired
    private HelloSender helloSender;

   // @PostConstruct
    public void hello() throws Exception {
        System.out.println("start rabbit");
        for (int i = 0; i < 5; i++) {
            helloSender.send(i);
        }

    }

   // @PostConstruct
    public void user() throws Exception {
        System.out.println("start rabbit object");
        helloSender.sendobj();

    }
    //@PostConstruct
    public void exchange() throws Exception {
        System.out.println("start rabbit exchange");
        helloSender.send1();
        helloSender.send2();

    }
 
}