package com.standard.linkedlist;

/**
 * @author Jerry
 * @create 2020-10-15 11:17
 */
public class LinkedMain {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(6);
        list.display();
    }
}
