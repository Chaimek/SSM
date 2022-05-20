package com.atguigu3.spring5.service.impl;

import com.atguigu3.spring5.Dao.UserDao;
import com.atguigu3.spring5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value="userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired  //根据类型进行注入,
    //底层源码boolean required() default true; 这个required的默认值是true,必须注入,如果IOC容器中没有bean，则会报一个错

    //   当有多个实现类时，不知道注入哪个实现类
    //   使用Qualifier根据名称进行筛选
    @Qualifier(value ="userDaoImpl2")
    private UserDao userDao;



    @Value(value = "小智")
    private String name;
    @Override
    public void add() {
        System.out.println(" 对象为 "+userDao.getClass().getName());
        System.out.println("service方法执行了" + " " + name);
        userDao.add();
    }

}
