package com.atguigu7.spring5.dao.impl;

import com.atguigu7.spring5.dao.BookDao;
import com.atguigu7.spring5.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book(user_id,username,ustatus) values(?,?,?)";

        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());
        System.out.println("影响的行数为："+ update);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username =?,ustatus= ? where user_id=? ";
        int update = jdbcTemplate.update(sql, book.getUsername(), book.getUstatus(), book.getUserId());
        System.out.println("影响的行数为： "+update);
    }

    @Override
    public void delete(Integer userId) {
        String sql ="delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql, userId);
        System.out.println("影响的行数为： "+update);
    }

    @Override
    public int selectCount() {

        String sql ="select count(*) from t_book";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public Book findOne(Integer id) {
        String sql="select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAll() {
        String sql="select * from t_book";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return query;
    }

    @Override
    public void batchDelete(List<Object[]> batchArr) {
        String sql ="delete from t_book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArr);
        System.out.println(Arrays.toString(ints));
    }

}
