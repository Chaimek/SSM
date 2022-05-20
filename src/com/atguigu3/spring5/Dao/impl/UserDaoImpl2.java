package com.atguigu3.spring5.Dao.impl;

import com.atguigu3.spring5.Dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl2")
public class UserDaoImpl2 implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDaoImpl2的add方法执行了");
    }
}
