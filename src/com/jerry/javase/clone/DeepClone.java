package com.jerry.javase.clone;

/**
 * 深拷贝
 * @author Jerry
 * @create 2020-04-24 0:39
 */
public class DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student("学生");
        Person person=new Person("张三",100,student);

        Object clone = person.clone();

        System.out.println(clone==person);

        System.out.println(person);
        System.out.println(clone);
        System.out.println("===================");
        //改为深拷贝后  浅拷贝拷贝的是引用  深拷贝拷贝到是整个对象
        //修改基本数据类型不受影响
        person.setAge(20);
        //修改对象引用的对象也不会受影响
        student.setStuName("李四");
        System.out.println(person);
        //clone对象不受影响
        System.out.println(clone);

    }
}
