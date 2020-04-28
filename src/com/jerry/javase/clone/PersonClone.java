package com.jerry.javase.clone;

/**
 * 浅拷贝
 * @author Jerry
 * @create 2020-04-24 0:23
 */
public class PersonClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student("学生");
        Person person=new Person("张三",100,student);

        Object clone = person.clone();

        System.out.println(clone==person);

        System.out.println(person);
        System.out.println(clone);
        System.out.println("===================");
        //浅拷贝的局限性
        //修改基本数据类型不受影响
        person.setAge(20);
        //修改对象引用的对象就会受影响
        student.setStuName("李四");
        System.out.println(person);
        System.out.println(clone);

    }
}
