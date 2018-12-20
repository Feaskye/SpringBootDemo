package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.example.entity.Member;
import com.example.exception.ServiceException;
import com.example.respository.IUserRespository;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
//@EnableAutoConfiguration
public class HomeController {
    
    @Autowired
    IUserRespository userRespository;

 
    /*
    * 首页
    * */
    @RequestMapping("/")
    public String index() {
        return "index ----- spring boot home Page";
    }


    @RequestMapping("/About")
    public String About(){
        throw new ServiceException("init error");
        //return "About";
    }





}
