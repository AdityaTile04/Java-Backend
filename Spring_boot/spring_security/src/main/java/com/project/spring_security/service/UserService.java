package com.project.spring_security.service;

import com.project.spring_security.dao.UserRepo;
import com.project.spring_security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user) {
        return userRepo.save( user );
    }

}
