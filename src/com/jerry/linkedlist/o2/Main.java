package com.jerry.linkedlist.o2;

/**
 * @author Jerry
 * @create 2020-05-05 14:55
 */
public class Main {
    public static void main(String[] args) {
        LinkList list=new LinkList();
        list.addAtHead(10);
        list.addAtHead(9);
        list.addAtHead(8);
        list.addAtHead(7);
        list.addAtHead(6);
        list.addAtHead(5);
        list.addAtTail(4);
        list.showList();
        System.out.println("++++++++++");
        list.addAtIndex(3,2);
        list.showList();
//        int i = list.get(10);
//        System.out.println(i);
    }
}
