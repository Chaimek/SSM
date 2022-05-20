package com.atguigu8.spring5.test;

import com.atguigu8.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean9.xml");
        UserService userService = classPathXmlApplicationContext.getBean("userServiceImpl", UserService.class);
        userService.changeCount();
    }
    @Test
    public void test02(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean10.xml");
        UserService userService = classPathXmlApplicationContext.getBean("userServiceImpl", UserService.class);
        userService.changeCount();
    }
}
