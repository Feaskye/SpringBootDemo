package com.example.nacos2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Nacos2demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Nacos2demoApplication.class, args);
    }

}
