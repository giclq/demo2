package com.example.demo.validateTest;


import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
@Controller
public class TestTest {
    @PostConstruct
    public void tt() {
        System.out.println("validate begin ");
        CumulativeActivityParam cumulativeActivityParam = new CumulativeActivityParam();
        cumulativeActivityParam.setModel(null);

        try {
            boolean b = BeanValidateUtils.beanValidator(cumulativeActivityParam);
        } catch (ApiException e) {
            System.out.println(e.getMessage());
        }


    }
}
