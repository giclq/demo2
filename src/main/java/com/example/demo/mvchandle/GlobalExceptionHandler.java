package com.example.demo.mvchandle;

import com.example.demo.validateTest.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    private Logger log = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(ApiException.class)
    @ResponseBody
    public HashMap jsonErrorHandler(ApiException e){
        HashMap<String, Object> result = new HashMap<>();
        result.put("code",e.getStatusCode().getCode());
        result.put("msg", e.getMessage());
        result.put("data",e.getDatas());
        result.put("timestamp",System.currentTimeMillis());
        result.put("className",this.getClass());
        result.put("methodName",Thread.currentThread().getStackTrace()[1].getMethodName());
        return result;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public HashMap jsonErrorHandler(Exception e){
        e.printStackTrace();
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 500);
        result.put("msg", e.getMessage());
        result.put("data",null);
        result.put("timestamp",System.currentTimeMillis());
        result.put("test222",System.currentTimeMillis());
        return result;
    }
}
