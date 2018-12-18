package com.example.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.example.entity.Member;
import com.example.exception.ServiceException;
import com.example.respository.IUserRespository;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {
    
    @Autowired
    IUserRespository userRespository;


    @RequestMapping("/")
    public String index() {

        String memList="";
        try{
        Iterable<Member> users=userRespository.findAll();
        }catch(Exception ex)
        {
            memList =ex.getLocalizedMessage();
            System.out.print(ex.getMessage());
        }
        //List<Member> members=new ArrayList(users);
        //String.join(";", users.)
        
        // while(iterator.hasNext())
        // {
        //     memList+=iterator.next().getUserName()+";";
        // }



        //查询data
        //view
        return "index------用户信息"+memList;
    }

    @RequestMapping("/users")
    public List<String> GetUsers()
    {
        return Arrays.asList(new String[]{"A","B"});
    }


    @RequestMapping("/About")
    public String About(){
        throw new ServiceException("init error");
        //return "About";
    }
    
}
