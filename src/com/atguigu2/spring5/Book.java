package com.atguigu2.spring5;

public class Book {
    private String bName;

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                '}';
    }

    public void setbName(String bName) {
        this.bName = bName;
    }
}
