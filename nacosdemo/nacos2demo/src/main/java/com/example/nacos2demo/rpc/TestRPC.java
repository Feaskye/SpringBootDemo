package com.example.nacos2demo.rpc;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-provider")
public interface TestRPC {

    @GetMapping("/config/get")
    int find();


}
