package com.atguigu2.spring5;

public class Stu {
    private String name;
    private Course course;

    public Stu() {
        System.out.println("第一，无参数构造函数调用了");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二set方法调用了");
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void initStu(){
        System.out.println("第三，init初始化方法调用了");
    }
    public void  destoryStu(){
        System.out.println("第五，销毁方法调用了");
    }
}
