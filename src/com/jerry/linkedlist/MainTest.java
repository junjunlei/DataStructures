package com.jerry.linkedlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Jerry
 * @create 2019-12-24 15:45
 */
public class MainTest {
    /**
     * 无序新增测试
     */
    @Test
    public void test01() {
        HeroNode hero1=new HeroNode(1,"宋江","及时雨");
        HeroNode hero2=new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3=new HeroNode(3,"吴用","智多星");
        HeroNode hero4=new HeroNode(4,"林冲","豹子头");
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);
        singleLinkedList.showList();
    }

    /**
     *有序新增测试
     */
    @Test
    public void test02() {
        HeroNode hero1=new HeroNode(1,"宋江","及时雨");
        HeroNode hero2=new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3=new HeroNode(3,"吴用","智多星");
        HeroNode hero4=new HeroNode(4,"林冲","豹子头");
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.showList();
    }

    /**
     * 链表反转测试
     */
    @Test
    public void test03() {
        HeroNode hero1=new HeroNode(1,"宋江","及时雨");
        HeroNode hero2=new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3=new HeroNode(3,"吴用","智多星");
        HeroNode hero4=new HeroNode(4,"林冲","豹子头");
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);
        System.out.println("反转之前");
        singleLinkedList.showList();
        singleLinkedList.reverseSingleLinkedList(singleLinkedList.getHead());
        System.out.println("反转之后");
        singleLinkedList.showList();
    }

    /**
     * 链表删除测试
     */
    @Test
    public void test04() {
        HeroNode hero1=new HeroNode(1,"宋江","及时雨");
        HeroNode hero2=new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3=new HeroNode(3,"吴用","智多星");
        HeroNode hero4=new HeroNode(4,"林冲","豹子头");
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);
        System.out.println("删除之前");
        singleLinkedList.showList();
        singleLinkedList.del(4);
        System.out.println("删除之后");
        singleLinkedList.showList();
    }

    /**
     * 链表修改测试
     */
    @Test
    public void test05() {
        HeroNode hero1=new HeroNode(1,"宋江","及时雨");
        HeroNode hero2=new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3=new HeroNode(3,"吴用","智多星");
        HeroNode hero4=new HeroNode(4,"林冲","豹子头");
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);
        System.out.println("修改之前");
        singleLinkedList.showList();
        singleLinkedList.update(new HeroNode(4,"改名","改昵称"));
        System.out.println("修改之后");
        singleLinkedList.showList();
    }

    /**
     * 新浪面试题 返回单链表倒数第k个节点
     */
    @Test
    public void test06() {
        HeroNode hero1=new HeroNode(1,"宋江","及时雨");
        HeroNode hero2=new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3=new HeroNode(3,"吴用","智多星");
        HeroNode hero4=new HeroNode(4,"林冲","豹子头");
        HeroNode hero5=new HeroNode(5,"宋江","及时雨");
        HeroNode hero6=new HeroNode(6,"卢俊义","玉麒麟");
        HeroNode hero7=new HeroNode(7,"吴用","智多星");
        HeroNode hero8=new HeroNode(8,"林冲","豹子头");
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);
        singleLinkedList.add(hero5);
        singleLinkedList.add(hero6);
        singleLinkedList.add(hero7);
        singleLinkedList.add(hero8);
        System.out.println("所有节点");
        singleLinkedList.showList();
        System.out.println("倒数节点");
        System.out.println(singleLinkedList.getLastIndexNode(singleLinkedList.getHead(),3));
    }
}
