package com.interview.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author Jerry
 * @create 2020-07-07 10:10
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 异常组   add  remove  element
         */

        /**
         * 特殊值  offer返回false  poll返回null  peek返回null
         *
         */

        /**
         * 一直阻塞  put  take
         */

        /**
         * 阻塞一段时间  offer(object,time) 超过时间返回false poll超过时间返回null
         */

        /**
         * 数组组成的有界阻塞队列
         *
         */
        Queue<String> queue = new ArrayBlockingQueue<>(2);
        queue.add("1");
        queue.add("1");
        //add队满抛异常  offer队满返回特殊值
        boolean offer = queue.offer("2");
        System.out.println(offer);
        queue.remove("1");
        queue.remove("1");
        queue.remove("2");
        //remove队列空抛异常
        //queue.remove();

        //只查看不删除 队列空也抛异常
        //String element = queue.element();

        queue.forEach(s->{
            System.out.println(s);
        });


        /**
         * 链表组成的有界阻塞队列
         *
         * 默认大小 Integer.MAX_VALUE
         */
        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();

        /**
         * 不存储元素的队列，即单个元素队列
         */
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();

        System.out.println("开始阻塞");
        synchronousQueue.offer("a",3, TimeUnit.SECONDS);
        System.out.println("阻塞了解除了");
    }
}
