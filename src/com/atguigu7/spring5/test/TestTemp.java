package com.atguigu7.spring5.test;

import com.atguigu7.spring5.pojo.Book;
import com.atguigu7.spring5.service.BookService;
import com.atguigu7.spring5.service.impl.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestTemp {
    @Test
    public void testAdd(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean8.xml");
        BookService bookService = classPathXmlApplicationContext.getBean("bookServiceImpl", BookService.class);
        Book book = new Book(null,"java","售空");
        bookService.add(book);
    }
    @Test
    public void testUpdateBook(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean8.xml");
        BookService bookService = classPathXmlApplicationContext.getBean("bookServiceImpl", BookService.class);
        Book book = new Book(1,"javaabsac","有库存");
        bookService.updateBook(book);
    }
    @Test
    public void testDelete(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean8.xml");
        BookService bookService = classPathXmlApplicationContext.getBean("bookServiceImpl", BookService.class);
        bookService.delete(1);
    }
    @Test
    public void testCount(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean8.xml");
        BookService bookService = classPathXmlApplicationContext.getBean("bookServiceImpl", BookService.class);
        int count = bookService.selectCount();
        System.out.println("数据库的总行数："+count);
    }    @Test
    public void testFindOne(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean8.xml");
        BookService bookService = classPathXmlApplicationContext.getBean("bookServiceImpl", BookService.class);
        Book book = bookService.findOne(2);
        System.out.println(book);
    }
    @Test
    public void testFindAll(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean8.xml");
        BookService bookService = classPathXmlApplicationContext.getBean("bookServiceImpl", BookService.class);
        List<Book> all = bookService.findAll();
        System.out.println(all);
    }
    @Test
    public void testBatchDelete(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean8.xml");
        BookService bookService = classPathXmlApplicationContext.getBean("bookServiceImpl", BookService.class);

        Object[] o1 ={4};
        Object[] o2 ={5};

        List<Object[]> batchArr = new ArrayList<>();
        batchArr.add(o1);
        batchArr.add(o2);

        bookService.batchDelete(batchArr);
    }
}
