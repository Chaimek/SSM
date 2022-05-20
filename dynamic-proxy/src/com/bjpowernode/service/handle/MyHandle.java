package com.bjpowernode.service.handle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 在invoke方法中
 *  1.调用目标对象的方法
 *  2.功能增强
 */
public class MyHandle implements InvocationHandler {


    private Object target = null;

    //要代理谁就把谁传进来，这里传的是目标对象
    public MyHandle(Object target) {
        this.target = target;
    }

    /**
     *
     * @param o  jdk创建的代理对象，无需我们赋值
     * @param method  目标对象的方法 ，jdk自动赋值
     * @param objects  目标对象的参数，jdk自动赋值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object res ;
        //1.调用目标对象的方法
        //调用目标对象的 method所指方法，这个目标对象通过构造器传进来
        res = method.invoke(target,objects);

        if (res != null){

            float price=(float)res ;
            //2.功能增强
            price = price + 25 ;

            res=price;
        }

        return res;
    }
}
