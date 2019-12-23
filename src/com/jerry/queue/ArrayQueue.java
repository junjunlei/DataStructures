package com.jerry.queue;

/**
 * 使用数组实现队列
 *
 * @author Jerry
 * @create 2019-09-28 21:52
 */
public class ArrayQueue {
    /**
     * 数组最大容量
     */
    private int maxSize;
    /**
     * 队列头
     */
    private int front;
    /**
     * 队列尾
     */
    private int rear;
    /**
     * 存放数据的数组
     */
    private int[] arr;

    /**
     * 创建队列的构造器
     */
    public ArrayQueue(int arrMaxSize) {
        this.maxSize = arrMaxSize;
        arr = new int[maxSize];
        //指向队列头,指向队列头前一个数据
        this.front = -1;
        //指向对象尾，指向队列尾数据
        this.rear = -1;
    }

    /**
     * 判断队列否为空
     *
     * @return true表示为空 false=表示不为空
     */
    public boolean isFull() {
        return maxSize - 1 == rear;
    }

    /**
     * 判断队列是否为空
     *
     * @return true表示为空 false表示不为空
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 添加数据到队列
     *
     * @param n 被添加的数
     */
    public void addQueue(int n) {
        //先判断队列是否已满
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        //尾指针后移
        rear++;
        arr[rear] = n;
    }

    /**
     * 获取队列数据，出队列
     *
     * @return
     */
    public int getQueue() {
        //先判断队列是否为空
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        //头指针后移
        front++;
        return arr[front];
    }

    /**
     * 显示队列的所有数据
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列数据为空，不能取数据");
        }
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
}
