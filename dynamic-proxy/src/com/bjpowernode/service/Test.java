package com.bjpowernode.service;

import com.bjpowernode.service.handle.MyHandle;
import com.bjpowernode.service.impl.UsbKingFactory;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //创建目标对象
        UsbSell usbSell = new UsbKingFactory();
        //创建InvocationHandler对象
         MyHandle myHandle = new MyHandle(usbSell);

        UsbSell usbSell1=(UsbSell)Proxy.newProxyInstance(usbSell.getClass().getClassLoader(),
                usbSell.getClass().getInterfaces(),
                myHandle);
        float sell = usbSell1.sell(85);
        System.out.println("sell = " + sell);
    }
}
