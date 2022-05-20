package com.atguigu3.spring5;

import org.springframework.stereotype.Component;

@Component(value = "userStudent") //value可以省略不写，默认是类名把首字母改小写
public class UserStudent {
    public void add(){
        System.out.println("add方法执行了");
    }
}
