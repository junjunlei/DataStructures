package com.jerry.javase.clone;

/**
 * @author Jerry
 * @create 2020-04-24 0:27
 */
public class Student implements Cloneable{
    private String stuName;

    public Student() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student(String stuName) {
        this.stuName = stuName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                '}';
    }
}
