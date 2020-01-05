package com.jerry.linkedlist;

/**
 * 单链表
 *
 * @author Jerry
 * @create 2019-12-24 15:06
 */
public class SingleLinkedList {
    /**
     * 头节点 数据不可动
     */
    private HeroNode head = new HeroNode(0, "", "");

    /**
     * 新增节点
     * 先不考虑顺序
     * 1.找到当前单链表的最后节点（node.next==null）
     * 2.最后节点的next指向新节点
     *
     * @param node 节点
     */
    public void add(HeroNode node) {

        //头节点不能动，需要辅助节点遍历链表
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            //中间变量到下一个节点
            temp = temp.next;
        }
        //获取到的temp是最后一个节点
        //最后节点的next指向新的节点
        temp.next = node;
    }

    /**
     * 按顺序新增节点
     * 1.如果有这个排名则提示失败
     * 2.获取temp位于添加位置的前一个节点
     */
    public void addByOrder(HeroNode node) {

        //辅助变量 遍历
        HeroNode temp = head;
        //排名存在标识
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > node.no) {
                break;
            } else if (temp.next.no == node.no) {
                //节点已存在
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.printf("准备插入的节点顺序%d已存在\n", node.no);
        } else {
            node.next = temp.next;
            temp.next = node;
        }

    }

    /**
     * 遍历链表
     */
    public void showList() {
        //判空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //中间变量辅助遍历
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                System.out.println(temp);
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    /**
     * 单链表反转（腾讯面试题）
     */
    public void reverseSingleLinkedList(HeroNode head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        //辅助遍历
        HeroNode cur = head.next;
        //当前节点的下一个节点
        HeroNode next;
        //辅助头节点
        HeroNode tempHead = new HeroNode(0, "", "");

        while (cur != null) {
            //记录当前节点的下一个节点
            next = cur.next;
            cur.next = tempHead.next;
            tempHead.next = cur;
            cur = next;
        }
        //实现反转
        head.next = tempHead.next;
    }

    /**
     * @return 返回头节点
     */
    public HeroNode getHead() {
        return head;
    }

    /**
     * 删除节点
     *
     * @param no 排序号
     */
    public void del(int no) {

        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            //已找到
            temp.next = temp.next.next;
        } else {
            System.out.printf("要删除的%d节点不存在\n", no);
        }
    }

    /**
     * 根据编号no修改节点 no编号不可变
     *
     * @param node
     */
    public void update(HeroNode node) {

        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = node.name;
            temp.nickName = node.nickName;
        } else {
            System.out.printf("要删除的%d节点不存在\n", node.no);
        }
    }

    /**
     * 获取单链表节点个数（如果有头节点，不统计头节点）
     *
     * @param head
     * @return
     */
    public static int getLength(HeroNode head) {
        if (head.next == null) {
            return 0;
        }
        int length = 0;
        HeroNode temp = head.next;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
    //单链表新浪面试题

    //获取单链表中倒数第k个节点

    public  HeroNode getLastIndexNode(HeroNode head, int index) {
        if(head.next==null){
            return null;
        }
        //1.获取链表长度
        int length = getLength(head);
        //2.length-size 就是要找的节点 遍历即可
        if(index<0||index>length){
            return null;
        }
        //遍历
        HeroNode temp=head.next;
        for(int i=0;i<length-index;i++){
            temp=temp.next;
        }
        return temp;
    }
}
