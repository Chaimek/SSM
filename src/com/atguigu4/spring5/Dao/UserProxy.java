package com.atguigu4.spring5.Dao;

import com.atguigu4.spring5.Dao.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserProxy {
    public static void main(String[] args) {
        UserDo userDao = new UserDaoImpl();
        Class[] interfaces = {UserDo.class};
        UserDo userDo = (UserDo) Proxy.newProxyInstance(UserProxy.class.getClassLoader(), interfaces, new Invocation(userDao));
        int add = userDo.add(10, 20);
        System.out.println(add);
    }
}
class Invocation implements InvocationHandler {
//    代理谁，就把谁传进来，也就是把被代理对象传进来，代理对象要调用被代理对象的方法，被代理对象就是拥有实际功能的方法
    private Object obj;

    public Invocation(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("在代理对象之前执行了");
        Object invoke = method.invoke(obj, objects);
        System.out.println("代理方法之后执行了");
        return invoke;
    }
}
