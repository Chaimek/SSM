package com.atguigu8.spring5.dao.impl;

import com.atguigu8.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addCount() {
        String sql = "update account set money = money-? where username = ?";
        jdbcTemplate.update(sql, 100, "lucy");
    }

    @Override
    public void deleteCount() {
        String sql = "update account set money = money+? where username = ?";
        jdbcTemplate.update(sql, 100, "mary");
    }
}
