package com.atguigu.spring5;

public class Order {
    private String name ;
    private Integer price;

    public Order(String name, Integer price) {

        this.name = name;
        this.price = price;
        System.out.println("有参数构造方法实现了");
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
