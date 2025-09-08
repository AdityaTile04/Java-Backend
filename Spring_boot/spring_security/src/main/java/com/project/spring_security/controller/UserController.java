package com.project.spring_security.controller;

import com.project.spring_security.model.User;
import com.project.spring_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    @Autowired
    private UserService service;

    @PostMapping("register")
    public User register(@RequestBody User user) {
        user.setPassword( encoder.encode( user.getPassword() ) );
        System.out.println(user.getPassword());
        return service.saveUser( user );
    }

}
