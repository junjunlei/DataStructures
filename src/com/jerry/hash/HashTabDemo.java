package com.jerry.hash;

import java.util.Scanner;

/**
 * @author Jerry
 * @create 2020-04-04 0:00
 */
public class HashTabDemo {
    public static void main(String[] args) {
        //创建哈希表
        HashTab hashTab = new HashTab(7);

        //写一个简单的菜单
        String key;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("add:  添加雇员");
            System.out.println("list: 显示雇员");
            System.out.println("find: 查找雇员");
            System.out.println("exit: 退出系统");

            key = scanner.next();
            switch (key) {
                case "add":
                    System.out.println("输入id");
                    int id = scanner.nextInt();
                    System.out.println("输入名字");
                    String name = scanner.next();
                    //创建 雇员
                    Emp emp = new Emp(id, name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}

/**
 * 员工
 */
class Emp {
    public int id;
    public String name;

    public Emp next;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class HashTab {
    private EmpLinkedList[] empLinkedListArray;
    private int size;

    public HashTab(int size) {
        this.size = size;
        empLinkedListArray = new EmpLinkedList[size];
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i] = new EmpLinkedList();
        }
    }

    /**
     * 添加雇员到HashTab
     *
     * @param emp
     */
    public void add(Emp emp) {
        //员工应该放哪条链表
        int empLinkedListNo = hashFun(emp.id);
        //添加到对应的链表
        empLinkedListArray[empLinkedListNo].add(emp);
    }

    /**
     * 遍历HashTab
     */
    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i].list(i);
        }
    }

    public void findEmpById(int id){
        //查找在哪条链表
        int empLinkedListNo = hashFun(id);
        Emp emp = empLinkedListArray[empLinkedListNo].findEmpById(id);
        //找到
        if(emp != null) {
            System.out.printf("在第%d条链表中找到 雇员 id = %d\n", (empLinkedListNo + 1), id);
        }else{
            System.out.println("在哈希表中，没有找到该雇员~");
        }
    }

    public int hashFun(int id) {
        return id % size;
    }
}

class EmpLinkedList {
    /**
     * 头指针  默认为空
     */
    private Emp head;

    /**
     * 添加员工 默认id是自增长
     * 只需将id员工放到链表最后即可
     * * @param emp
     */
    public void add(Emp emp) {
        //第一个雇员
        if (head == null) {
            head = emp;
            return;
        }
        //如果不是第一个雇员，使用辅助指针，定位到最后的雇员
        Emp curEmp = head;
        while (true) {
            //找到最后的雇员
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
        //将添加的员工放到链表最后
        curEmp.next = emp;
    }

    public void list(int no) {
        if (head == null) {
            System.out.println("第" + (no + 1) + "链表为空");
            return;
        }
        System.out.println("第" + (no + 1) + "链表的信息为");
        //辅助指针
        Emp curEmp = head;
        while (true) {
            System.out.printf("==> id=%d name=%s \t", curEmp.id, curEmp.name);
            if (curEmp.next == null) {
                break;
            }
            //指针后移
            curEmp = curEmp.next;
        }
        System.out.println();
    }

    /**
     * 根据id查找员工
     * @param id
     * @return
     */
    public Emp findEmpById(int id) {
        if (head == null) {
            System.out.println("链表为空");
            return null;
        }
        //辅助指针
        Emp curEmp = head;
        while (true) {
            //找到
            if (curEmp.id == id) {
                break;
            }
            //没找到
            if (curEmp.next == null) {
                curEmp = null;
                break;
            }
            //指针指向下一个
            curEmp = curEmp.next;
        }
        return curEmp;
    }
}