package com.atguigu8.spring5.test;


import com.atguigu8.spring5.service.UserService;
import org.junit.jupiter.api.Test;//Junit5的jar包位置
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean10.xml")
//可以把以上两行注解合成下面这一个注解
@SpringJUnitConfig(locations = "classpath:bean10.xml")//在junit4中不支持
public class testJunit5AndSpring {
    @Autowired
    private UserService userService;
    @Test
    public void test(){
        userService.changeCount();
    }
}
