package com.example.nacos1demo.service;

import com.example.nacos1demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    @Autowired
    TestMapper testMapper;

    public int find(){
        return testMapper.find();
    }




}
