package com.project.spring_security.service;

import com.project.spring_security.dao.UserRepo;
import com.project.spring_security.model.User;
import com.project.spring_security.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       User user = userRepo.findByUsername( username );
       if(user == null) {
           System.out.println("User 404");
           throw new UsernameNotFoundException( "User 404" );
       }

        return new UserPrincipal(user);
    }
}
