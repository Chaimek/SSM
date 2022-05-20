package com.atguigu2.spring5;

public class Course {
    private String Cname;

    @Override
    public String toString() {
        return "Course{" +
                "Cname='" + Cname + '\'' +
                '}';
    }

    public void setCname(String cname) {
        Cname = cname;
    }
}
