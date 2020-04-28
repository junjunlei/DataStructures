package com.jerry.linkedlist.o1;

/**
 * @author Jerry
 * @create 2020-04-23 16:54
 */
public class LinkListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1, "宋江");
        Node node2 = new Node(2, "卢俊义");
        Node node3 = new Node(3, "吴用");
        Node node4 = new Node(4, "林冲");
        Node node5 = new Node(5, "随便写");
        LinkList list = new LinkList();
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);
        list.list();
        list.reversion(list.getFirst());
        System.out.println("=====================");
        list.list();
    }
}

class LinkList {
    private Node first;

    public LinkList() {
        this.first = null;
    }

    public Node getFirst() {
        return first;
    }

    /**
     * 头插法
     *
     * @param node
     */
    public void addNode(Node node) {
        node.next = first;
        first = node;
    }
    public Node FindKthToTail(Node head,int k) {
        if(head==null||k<0){
            return null;
        }
        Node temp=head;
        int length=0;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        Node tmp=head;
        for(int i=0;i<=length-k;i++){
            tmp=tmp.next;
        }
        return tmp;
    }
    public void addAtTail(int val) {
        Node node=new Node(val,"插到尾部");
        Node temp=this.first;
        while(true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=node;
    }
    public void list() {
        if (this.first == null) {
            return;
        }
        Node temp = this.first;
        while (true) {
            if (temp.next == null) {
                System.out.println(temp);
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void reversion(Node head) {
        if (head == null) {
            return;
        }
        Node cur=head.next;
        Node next;
        Node node=new Node(0,"");
        while (cur!=null){
            next=cur.next;
            cur.next=node.next;
            node.next=cur;
            cur=next;
        }
        System.out.println(node);
        head.next=node.next;
    }

}

class Node {
    public int no;
    public String name;
    public Node next;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
