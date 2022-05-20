package com.atguigu7.spring5.service;

import com.atguigu7.spring5.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    public void add(Book book);

    public void updateBook(Book book);

    public void delete(Integer userId);

    public int selectCount();

    public  Book findOne(Integer id);

    public List<Book> findAll();

    public void batchDelete(List<Object[]> batchArr);

}
