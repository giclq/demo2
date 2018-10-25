package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private MyUserRepository applicationUserRepository;
//    public UserController(MyUserRepository myUserRepository,
//                          BCryptPasswordEncoder bCryptPasswordEncoder) {
//        this.applicationUserRepository = myUserRepository;
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//    }

    @PostMapping("/signup")
    public void signUp(@RequestBody MyUser user) {

        user.setPassword(new CustomPasswordEncoder().encode(user.getPassword()));
        System.out.println(user.getPassword());
        applicationUserRepository.save(user);
        System.out.println("pwd:"+applicationUserRepository.findByUsername(user.getUsername()).getPassword());

    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
