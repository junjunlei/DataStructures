package com.jerry.linkedlist;

/**
 * 约瑟夫环
 * <p>
 * ****  设编号为 1，2，...n的n个人围坐一圈，约定编号为k(1<=k<=n)的人从1开始报数，数到m的那个人出列，
 * 它的下一位又从1开始报数，数到m的那个人又出列，依次类推，直到所有人出列，由此产生一个出队编号得的序列
 *
 * @author Jerry
 * @create 2020-04-08 13:47
 */
public class Josepfu {
    public static void main(String[] args) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addNode(5);
        circleSingleLinkedList.showNode();
        circleSingleLinkedList.countNode(1,2,5);
    }
}

/**
 * 环形单向链表
 */
class CircleSingleLinkedList {
    /**
     * 创建第一个节点 默认null
     */
    private Node first;

    /**
     * 创建环形队列
     *
     * @param num
     */
    public void addNode(int num) {
        if (num < 1) {
            return;
        }
        Node curNode = null;
        for (int i = 1; i <= num; i++) {
            Node node = new Node(i);
            //第一个节点
            if (i == 1) {
                first = node;
                first.setNext(node);
                curNode = first;
            } else {
                curNode.setNext(node);
                node.setNext(first);
                curNode = node;
            }
        }
    }

    /**
     * 遍历当前循环链表
     */
    public void showNode() {
        if (first == null) {
            return;
        }
        Node curNode = first;
        while (true) {
            System.out.printf("第 %d个小孩 \n", curNode.getNo());
            if (curNode.getNext() == first) {
                break;
            }
            curNode = curNode.getNext();
        }
    }

    /**
     * 计算小孩出圈顺序
     *
     * @param k   表示从第几个小孩开始数数
     * @param m   表示数几下
     * @param num 最初小孩数
     */
    public void countNode(int k, int m, int num) {
        if (first == null || k < 1 || k > num || m < 0) {
            return;
        }
        Node curNode = first;
        //让辅助节点指向最后一个节点
        while (true) {
            if (curNode.getNext() == first) {
                break;
            }
            curNode = curNode.getNext();
        }
        //让当要报数的小孩为第一个节点
        for(int i=0;i<k-1;i++){
            first=first.getNext();
            curNode=curNode.getNext();
        }
        //从报数节点移动m-1次，要出圈的节点为first
        while (true){
            //表示只有一个人
            if(curNode==first){
                System.out.printf("出圈 %d 的小孩 \n", first.getNo());
                break;
            }
            //移动m-1次
            for (int j=0;j<m-1;j++){
                first=first.getNext();
                curNode=curNode.getNext();
            }
            System.out.printf("出圈 %d 的小孩 \n", first.getNo());
            //出圈小孩的下一个小孩为第一个小孩
            first=first.getNext();
            //新first就是之前最后一个节点的下一个节点
            curNode.setNext(first);
        }

    }
}

/**
 * 节点
 */
class Node {
    /**
     * 编号
     */
    private int no;
    /**
     * 下一个节点
     */
    private Node next;

    public Node(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}