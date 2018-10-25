package com.example.demo.other.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Controller
public class YmlConfig {

    @Value("${server.test}")
    String serverPort;

    public YmlConfig(@Value("${server.test}") String appKey) {
        System.out.println("YmlConfig:"+appKey);
    }

    //@PostConstruct
    public void test(){
        System.out.println("serverPort:"+serverPort);
    }
}
