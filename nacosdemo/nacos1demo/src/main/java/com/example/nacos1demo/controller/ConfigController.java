package com.example.nacos1demo.controller;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.example.nacos1demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Autowired
    TestService testService;
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @GetMapping("/get")
    public int find(){
        System.out.println("useLocalCache:"+useLocalCache);
        return testService.find();
    }



}
