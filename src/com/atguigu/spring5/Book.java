package com.atguigu.spring5;

public class Book {
    private String name;
    private Integer price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void add(){
        System.out.println("name:" +this.name);
        System.out.println("price:"+this.price);
    }
}
