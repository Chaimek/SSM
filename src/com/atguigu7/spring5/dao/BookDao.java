package com.atguigu7.spring5.dao;

import com.atguigu7.spring5.pojo.Book;

import java.util.List;

public interface BookDao {
    public void add(Book book);

    void updateBook(Book book);

    void delete(Integer userId);

    int selectCount();

    Book findOne(Integer id);

    List<Book> findAll();

    void batchDelete(List<Object[]> batchArr);
}
