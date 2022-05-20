package com.atguigu3.spring5.Dao.impl;

import com.atguigu3.spring5.Dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImpl的add方法执行了");
    }
}
