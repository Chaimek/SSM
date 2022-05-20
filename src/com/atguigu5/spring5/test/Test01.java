package com.atguigu5.spring5.test;

import com.atguigu5.spring5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean6.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        user.add();

    }
}
