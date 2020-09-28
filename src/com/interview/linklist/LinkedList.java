package com.interview.linklist;

/**
 * @author Jerry
 * @create 2020-07-10 14:21
 */
public class LinkedList {

    /**
     * 头节点
     */
    private Node head;
    /**
     * 链表长度
     */
    private Integer size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int length() {
        return size;
    }

    public void add(Object obj) {
        Node node = new Node(obj);
        //头插法
        node.next = head;
        head = node;
        size++;
    }

    public void addTail(Object obj) {
        Node node = new Node(obj);
        //尾插法
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public void show() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp);
            temp = temp.next;
        }
        System.out.println(temp);
    }

    public Node reverse(Node head) {
        //借用辅助链表  完成反转
        Node temp = null;
        while (head != null) {
            Node p=head.next;
            head.next=temp;
            temp=head;
            head=p;
        }
        while (temp.next!=null){
            System.out.println(temp);
            temp=temp.next;
        }
        System.out.println(temp);
        return temp;
    }

    public Node getHead(){
        return head;
    }
    /**
     * 节点
     */
    private class Node {
        Object item;
        Node next;

        public Node(Object item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    '}';
        }
    }
}
