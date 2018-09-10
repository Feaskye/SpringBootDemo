package com.example.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
// import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@EntityScan
@Entity
@Table(name="Member")
public class Member{
//http://www.cnblogs.com/guanghuiqq/archive/2012/08/20/2647117.html
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;

    @Column(name="UserName")
    private String UserName;


    public int getId()
    {
        return this.Id;
    }


    public String getUserName()
    {
        return this.UserName;
    }


    




}