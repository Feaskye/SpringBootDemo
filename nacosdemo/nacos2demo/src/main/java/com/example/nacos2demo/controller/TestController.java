package com.example.nacos2demo.controller;


import com.example.nacos2demo.rpc.TestRPC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    TestRPC testRPC;


    @GetMapping("/f")
    public int find(){
        return testRPC.find();
    }


}
