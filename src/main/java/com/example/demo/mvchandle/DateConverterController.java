package com.example.demo.mvchandle;

import com.example.demo.validateTest.ApiException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateConverterController {
//http://127.0.0.1:9099/date?date=2011-21-22
    @RequestMapping("/date")
    public void hello(Date date){
        System.out.println(date.toString());
    }
}
