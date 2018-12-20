package com.example.controller;

import com.example.entity.Member;
import com.example.respository.IUserRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
//@EnableAutoConfiguration
public class LoginController {
    
    @Autowired
    IUserRespository userRespository;

    @RequestMapping("/Login")
    public String Index() {
        long userCount=userRespository.count();

        // for (Member user : users) {
            
        // }

        return "用户数量：" + userCount;
    }

    @RequestMapping("/OutLog")
    public String OutLog(){
        return "About";
    }
    
}
