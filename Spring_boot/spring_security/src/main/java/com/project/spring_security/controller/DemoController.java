package com.project.spring_security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String greet(HttpServletRequest req) {
        return "Hello World " + req.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest req) {
        return "About " + req.getSession().getId();
    }

}
