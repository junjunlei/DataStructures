package com.jerry.queue;

/**
 * 使用数组实现环形队列
 *
 * @author Jerry
 * @create 2019-12-23 20:09
 */
public class CircelArrayQueue {
    /**
     * 队列最大容量
     */
    private int maxSize;
    /**
     * 队列头 指向队列的第一元素
     */
    private int front;
    /**
     * 队列尾 指向队列最后一个元素的后一个元素
     */
    private int rear;
    /**
     * 存放队列的数组
     */
    private int []arr;

    public CircelArrayQueue(int arrMaxSize){
        //预留一个空间
        this.maxSize=arrMaxSize;
        this.arr=new int[maxSize];
        this.front=0;
        this.rear=0;
    }

    /**
     * @return true 为已满 false为未满
     */
    public boolean isFull(){
        return (rear+1)%maxSize==front;
    }
    public boolean isEmpty(){
        return rear==front;
    }

    /**
     * 添加数据到队列
     * @param n
     */
    public void addQueue(int n){
        //先判断队列是否已满
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        //直接加入数据
        arr[rear]=n;
        //rear后移 取模防止数组越界 使数组循环
        rear=(rear+1)%maxSize;
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
        //front指向队列第一个元素
        int value=arr[front];
        //头指针后移 取模 防止数组越界
        front=(front+1)%maxSize;
        return value;
    }
    /**
     * 显示队列的所有数据
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列数据为空，不能取数据");
            return;
        }
        //可以循环 所以这里必须是有效数据
        for(int i=front;i<front+size();i++){
            System.out.printf("arr[%d]=%d\n",i%maxSize,arr[i]);
        }
    }

    /**
     * @return 获取队列的有效数据个数
     */
    public int size(){
        return (rear+maxSize-front)%maxSize;
    }

    /**
     * @return 显示队列头数据 ， 不是取数据
     */
    public int headQueue(){
        //先判断队列是否为空
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        return arr[front];
    }
}
