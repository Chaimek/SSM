package com.atguigu5.spring5;

import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    public void add(){
        System.out.println("add........");
    }
}
