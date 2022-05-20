package com.atguigu6.spring5;

import com.atguigu5.spring5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean7.xml");
        Book book = classPathXmlApplicationContext.getBean("book", Book.class);
        book.buy();
    }
}
