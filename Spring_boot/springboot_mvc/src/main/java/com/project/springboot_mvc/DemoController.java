package com.project.springboot_mvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/demo")
    public String demo() {
        return "demo.jsp";
    }

    @RequestMapping("calc")
    public String calc(HttpServletRequest req, HttpSession session) {

        int n1 = Integer.parseInt( req.getParameter( "num1" ));
        int n2 = Integer.parseInt( req.getParameter( "num2" ));

        int res = n1 + n2;

        session.setAttribute( "res", res );
        return "res.jsp";
    }

}
