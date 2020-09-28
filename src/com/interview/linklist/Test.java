package com.interview.linklist;

/**
 * @author Jerry
 * @create 2020-07-10 14:45
 */
public class Test {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addTail(0);
        list.show();
        System.out.println(list.length());

        list.reverse(list.getHead());


    }
}
