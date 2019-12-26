package com.jerry.linkedlist;

/**
 * 单链表
 * @author Jerry
 * @create 2019-12-24 15:06
 */
public class SingleLinkedList {
    /**
     * 头节点 数据不可动
     */
    private HeroNode head=new HeroNode(0,"","");

    /**
     * 新增节点
     * 先不考虑顺序
     * 1.找到当前单链表的最后节点（node.next==null）
     * 2.最后节点的next指向新节点
    * @param node 节点
     */
    public void add(HeroNode node){

        //头节点不能动，需要辅助节点遍历链表
        HeroNode temp=head;
        while(true){
            if(temp.next==null){
                break;
            }
            //中间变量到下一个节点
            temp=temp.next;
        }
        //获取到的temp是最后一个节点
        //最后节点的next指向新的节点
        temp.next=node;
    }

    /**
     * 遍历链表
     */
    public void showList(){
        //判空
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        //中间变量辅助遍历
        HeroNode temp=head;
        while(true){
            if(temp.next==null){
                System.out.println(temp);
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }
}
