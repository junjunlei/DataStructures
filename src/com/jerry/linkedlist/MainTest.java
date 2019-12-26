package com.jerry.linkedlist;

import org.junit.Test;

/**
 * @author Jerry
 * @create 2019-12-24 15:45
 */
public class MainTest {
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
}
