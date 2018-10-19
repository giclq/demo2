package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    //不能这样用
//    @Autowired
//    private MyUserRepository myUserRepository;
    @Autowired
    private MyUserRepository applicationUserRepository;

//    public UserDetailsServiceImpl(MyUserRepository applicationUserRepository) {
//        this.applicationUserRepository = applicationUserRepository;
//    }
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println(s);
        System.out.println(applicationUserRepository);
        System.out.println("11");
        MyUser u = applicationUserRepository.findByUsername(s);
        System.out.println(u);
        System.out.println(u.getPassword());
//        u.setUsername("clq");
//        u.setPassword("8a121ce581499d7b701668698d51a19d");
        return u;
        //return repositorys.findByUsername(s);
    }
}
