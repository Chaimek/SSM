package com.atguigu3.spring5.test;

import com.atguigu3.spring5.SpringConfigClass.SpringConfig;
import com.atguigu3.spring5.UserStudent;
import com.atguigu3.spring5.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAdd {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5.xml");
        UserStudent userStudent = applicationContext.getBean("userStudent", UserStudent.class);
        userStudent.add();
        System.out.println(userStudent);
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5.xml");
        UserServiceImpl userServiceImpl = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.add();
        System.out.println(userServiceImpl);
    }
    @Test
    public void test3(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServiceImpl userServiceImpl = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.add();
        System.out.println(userServiceImpl);
    }


}
