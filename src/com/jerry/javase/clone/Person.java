package com.jerry.javase.clone;

/**
 * @author Jerry
 * @create 2020-04-24 0:20
 */
public class Person  implements  Cloneable{
    private String name;
    private Integer age;

    private Student student;

    /**
     *  权限修饰符 改为public
     *
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        //深拷贝不能简单调用这个方法
        //return super.clone();

        //克隆一个学生对象
        Person person=(Person) super.clone();
        //调用Student类的clone()
        Student clone = (Student)this.student.clone();
        person.setStudent(clone);
        return person;
    }

    public Person() {
    }

    public Person(String name, Integer age,Student student) {
        this.name = name;
        this.age = age;
        this.student=student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student +
                '}';
    }
}
