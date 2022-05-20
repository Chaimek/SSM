package com.atguigu.spring5;

import java.util.List;

public class Stu {
    private String name;
    private List<String> coursesList;

    public void setName(String name) {
        this.name = name;
    }
//    private List<Course> courseList;
//
//    @Override
//    public String toString() {
//        return "Stu{" +
//                "name='" + name + '\'' +
//                ", courseList=" + courseList +
//                '}';
//    }
//
//    public void setCourseList(List<Course> courseList) {
//        this.courseList = courseList;
//    }
        public void setCoursesList(List<String> coursesList) {
        this.coursesList = coursesList;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", coursesList=" + coursesList +
                '}';
    }
}
