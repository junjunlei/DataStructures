package com.standard.linkedlist;

/**
 * 单链表
 *
 * @author Jerry
 * @create 2020-10-15 0:27
 */
public class LinkedList {
    /**
     * 头节点
     */
    private Node first;
    /**
     * 节点个数
     */
    private int size;

    public LinkedList() {
        this.first = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 头插法
     *
     * @param val
     */
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = first;
        first = node;
        size++;
    }

    /**
     * 删除头节点
     *
     * @return
     */
    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        size--;
        return temp;
    }

    /**
     * 尾插法
     *
     * @param val
     */
    public void insertLast(int val) {
        Node node = new Node(val);
        Node temp = first;
        if (temp == null) {
            first = node;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    /**
     * 删除尾节点
     *
     * @return
     */
    public Node deleteLast() {
        Node temp = first;
        if (temp == null) {
            return null;
        }
        Node next = temp.next;
        while (next.next != null) {
            temp = next;
            next = next.next;
        }
        temp.next = null;
        return temp;
    }

    /**
     * 链表元素个数
     *
     * @return
     */
    public int size() {
        return size;
    }

    public void display(){
        if (first == null) {
            return;
        }
        Node temp=first;
        System.out.println("链表元素个数为："+size);
        while (temp.next != null) {
            System.out.print(temp.val+"--->");
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
}
