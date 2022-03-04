package com.feaskye.skyboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HomeController {

//    @RequestMapping("/")
//    public String Home()
//    {
//        return "hello world";
//    }

    @Autowired
    DataSource dataSource;

    @RequestMapping("/success")
    public String success(Map<String, String> map) {
        map.put("key", "哈哈哈");


        Connection connection = dataSource.getConnection();


        AtomicInteger atomicInteger=new AtomicInteger();





        return "hello world";
    }


}
