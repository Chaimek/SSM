package com.atguigu8.spring5.test;

import com.atguigu8.spring5.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean10.xml")//加载哪个配置类
public class testJunit4AndSpring {
    @Autowired
    private UserService userService;
    @Test
    public void test(){
        userService.changeCount();
    }
}
