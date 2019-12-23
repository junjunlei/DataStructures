package com.jerry.queue;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author Jerry
 * @create 2019-12-23 17:25
 */
public class MainTest {

    @Test
    public void test01() {
        //创建队列
        ArrayQueue arrayQueue = new ArrayQueue(3);
        //接收用户输入
        char key;
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while (loop) {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):查看队列头的数据");
            key = scan.next().charAt(0);
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数：");
                    int value = scan.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                //查看队列头数据
                case 'h':
                    try {
                        int result = arrayQueue.headQueue();
                        System.out.printf("队列头的数据是%d\n", result);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                //取出队列数据
                case 'g':
                    try {
                        int result = arrayQueue.getQueue();
                        System.out.printf("取出的队列数据是%d\n", result);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scan.close();
                    loop=false;
                    break;
                default:
                    break;

            }

        }
        System.out.println("程序退出");

    }

    @Test
    public void test02() {
        //创建队列
        CircelArrayQueue arrayQueue = new CircelArrayQueue(3);
        //接收用户输入
        char key;
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while (loop) {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):查看队列头的数据");
            key = scan.next().charAt(0);
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数：");
                    int value = scan.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                //查看队列头数据
                case 'h':
                    try {
                        int result = arrayQueue.headQueue();
                        System.out.printf("队列头的数据是%d\n", result);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                //取出队列数据
                case 'g':
                    try {
                        int result = arrayQueue.getQueue();
                        System.out.printf("取出的队列数据是%d\n", result);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scan.close();
                    loop=false;
                    break;
                default:
                    break;

            }

        }
        System.out.println("程序退出");

    }
}
