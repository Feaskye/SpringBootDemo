package com.example.nacos1demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Nacos1demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Nacos1demoApplication.class, args);
    }

}
