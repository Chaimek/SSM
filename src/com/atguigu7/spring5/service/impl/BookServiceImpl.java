package com.atguigu7.spring5.service.impl;

import com.atguigu7.spring5.dao.BookDao;
import com.atguigu7.spring5.pojo.Book;
import com.atguigu7.spring5.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public void add(Book book) {
        bookDao.add(book);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    public void delete(Integer userId) {
        bookDao.delete(userId);
    }

    @Override
    public int selectCount() {
        return bookDao.selectCount();
    }

    @Override
    public Book findOne(Integer id) {
        return bookDao.findOne(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public void batchDelete(List<Object[]> batchArr) {
        bookDao.batchDelete(batchArr);
    }
}
