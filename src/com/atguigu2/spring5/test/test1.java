package com.atguigu2.spring5.test;

import com.atguigu2.spring5.Stu;
import com.atguigu2.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    @Test
    public void testStu(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean4.xml");
        Stu stu = classPathXmlApplicationContext.getBean("stu", Stu.class);

        System.out.println("第四，bean对象创建了："+ stu);

//        ico容器关闭，自动调用bean的销毁方法，这个方法需要手动配置
        classPathXmlApplicationContext.close();
    }    @Test
    public void testUser(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean4.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);

        System.out.println("第四，bean对象创建了："+ user);

//        ico容器关闭，自动调用bean的销毁方法，这个方法需要手动配置
        classPathXmlApplicationContext.close();
    }

}
