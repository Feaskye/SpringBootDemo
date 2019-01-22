package com.feaskye.skyboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

//    @RequestMapping("/")
//    public String Home()
//    {
//        return "hello world";
//    }

    @RequestMapping("/success")
    public String success(Map<String,String> map)
    {
        map.put("key","哈哈哈");
        return "hello world";
    }


}
