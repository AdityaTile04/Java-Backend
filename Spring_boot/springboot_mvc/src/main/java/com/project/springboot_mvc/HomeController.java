package com.project.springboot_mvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName() {
        return "Data Science";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(int number1, int number2, ModelAndView mv) {

       int res = number1 + number2;

       mv.addObject( "res", res );
        mv.setViewName( "result" );
        return mv;
    }

    @RequestMapping("addStudent")
    public String addStudent(@ModelAttribute("stud1") Student student) {

//        Student s = new Student();
//        s.setSid( sid );
//        s.setSname( sname );

//        mv.addObject( "s", s );
//        mv.setViewName( "result" );
//        return mv;


        return "result";
    }

}
