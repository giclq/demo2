package com.example.demo.mvchandle;


import com.example.demo.validateTest.ApiException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController {

    @RequestMapping("/mvcerr")
    public void hello(){
        throw new ApiException("error");
        //return "hello 汉字测试";
    }
}
