package com.atguigu.spring5.testDemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Order;
import com.atguigu.spring5.Stu;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;

public class TestSpring5 {
    @Test
    public void testBook(){
        //加载Spring配置文件，使用ApplicationContext在这一步就把配置文件中的<bean>中的对象都创建出来了
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean1.xml");
        Book book = applicationContext.getBean("books", Book.class);
        book.add();
//        Book user = applicationContext.getBean("book", Book.class);
        System.out.println(book);
    }
    @Test
    public void testOrder(){
         ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean1.xml");

        Order order = applicationContext.getBean("order", Order.class);
        System.out.println(order);
    }
    @Test
    public void testStu1(){
         ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean2.xml");

        Stu stu= applicationContext.getBean("stu", Stu.class);
        System.out.println(stu);
    }

    @Test
    public void testStu2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean3.xml");

        Stu stu= applicationContext.getBean("stu", Stu.class);

        System.out.println(stu);
    }
}
