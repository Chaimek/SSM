package com.atguigu8.spring5.service.impl;

import com.atguigu8.spring5.dao.UserDao;
import com.atguigu8.spring5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional(propagation = Propagation.REQUIRED)//在类上，对所有的方法都开启事务
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
//@Bean指示方法产生一个由Spring容器管理的bean。
    @Override
    public void changeCount() {
        userDao.addCount();

//        int i = 10/0 ;

        userDao.deleteCount();
    }
}
