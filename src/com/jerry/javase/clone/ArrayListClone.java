package com.jerry.javase.clone;

import java.util.ArrayList;

/**
 * 克隆的基本使用
 *   将一个List数据拷贝到另一个List
 * @author Jerry
 * @create 2020-04-23 23:46
 */
public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        Object clone = list.clone();
        //false
        System.out.println(clone==list);
        System.out.println(list);
        System.out.println(clone);
    }
}
