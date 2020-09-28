package com.jdk.long_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jerry
 * @create 2020-07-06 14:17
 */
public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(6);
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("3");
        list.add("4");

        /**
         * 这样移除会留一个3
         */
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).equals("3")){
//                list.remove("3");
//            }
//        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("3")){
                //并发修改异常
                //list.remove(next);

                //可以用迭代器的移除

                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
