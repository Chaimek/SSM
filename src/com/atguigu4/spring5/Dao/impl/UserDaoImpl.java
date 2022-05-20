package com.atguigu4.spring5.Dao.impl;

import com.atguigu4.spring5.Dao.UserDo;

public class UserDaoImpl implements UserDo {
    @Override
    public int add(int a, int b) {
        System.out.println("UserDaoImpl的add方法执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("UserDaoImpl的update方法执行了");
        return id;
    }
}
