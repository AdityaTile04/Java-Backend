package com.aditya.spring_boot_rest.controller;

import com.aditya.spring_boot_rest.model.User;
import com.aditya.spring_boot_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

//    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    @PostMapping("register")
    public User saveUser(@RequestBody User user) {
        return service.saveUser( user );
    }

}
