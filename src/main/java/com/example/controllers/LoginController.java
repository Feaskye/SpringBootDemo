package com.example.controllers;

import org.springframework.web.bind.annotation.RestController;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class LoginController {
    
    @RequestMapping("/Login")
    public String Index() {
        return "index";
    }

    @RequestMapping("/OutLog")
    public String OutLog(){
        return "About";
    }
    
}
