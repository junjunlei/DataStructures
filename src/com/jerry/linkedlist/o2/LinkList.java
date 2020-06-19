package com.jerry.linkedlist.o2;

/**
 * 不带头节点的链表实现
 * <p>
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 *
 * @author Jerry
 * @create 2020-05-05 14:04
 */
public class LinkList {
    private Node head;

    private class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }

    public LinkList() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    /**
     * 在链表中第index个节点之前插入值为val的节点
     * 如果index等于链表长度则插入尾部，如果大于长度，则不会插入
     * 如果index小于0则插入头部
     *
     * @param index
     * @param val
     */
    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        int length = 0;
        if (this.head == null) {
            head = node;
        }
        Node temp=this.head;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        length=length+1;
        if(index==length){
            addAtTail(val);
        }
        if(index<0){
            addAtHead(val);
        }
        if(index<length){
            Node p=this.head;
            for(int i=0;i<index-2;i++){
                p=p.next;
            }
            node.next=p.next;
            p.next=node;
        }
    }

    /**
     * 删除索引index的节点
     *
     * @param index
     */
    public void deleteAtIndex(int index) {

    }

    /**
     * 获取链表中第i个元素
     * 如果索引无效 则返回-1
     *
     * @param i
     * @return
     */
    public int get(int i) {
        Node temp = this.head;
        for (int index = 0; index < i; index++) {
            if (temp == null) {
                return -1;
            }
            temp = temp.next;
        }
        return temp.val;
    }

    /**
     * 头插法
     * 插入后，新节点将成为链表的第一个节点
     *
     * @param val
     */
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    /**
     * 尾插法
     *
     * @param val
     */
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            head = node;
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void showList() {
        if (this.head == null) {
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            System.out.println(temp);
            temp = temp.next;
        }
        System.out.println(temp);
    }

}
