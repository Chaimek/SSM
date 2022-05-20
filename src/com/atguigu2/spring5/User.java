package com.atguigu2.spring5;

public class User {
    private String name;
    private Book book;

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
