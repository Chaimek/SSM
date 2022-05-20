package com.atguigu5.spring5;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect//将UserProxy转化为一个AspectJ切面
public class UserProxy {
    @Before(value = "execution(* com.atguigu5.spring5.User.add(..))")
    public void before(){
        System.out.println("before.........");
    }
}
