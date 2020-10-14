package com.standard.queue;

/**
 * 队列
 * @author Jerry
 * @create 2020-10-14 16:02
 */
public class QueueX {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueX(int capacity) {
        maxSize = capacity;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /**
     * 入队列
     *
     * @param item
     */
    public void insert(long item) {
        if(isFull()){
            throw new RuntimeException("队列已满");
        }
        //在插入时先将队尾+1，再插入，所以当队尾到达数组顶端（maxSize-1）时，它必须绕回到数组底端(0)
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = item;
        nItems++;
    }

    /**
     * 出队列
     *
     * @return
     */
    public long remove() {
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        //先移除当前队头，再+1，当队列头到达数组顶端（maxSize-1）时，必须绕回到数组下标为0的位置
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return queArray[front++];
    }

    /**
     * 查看队头元素（不出队列）
     *
     * @return
     */
    public long peek() {
        return queArray[front];
    }

    /**
     * 队列是否空
     *
     * @return
     */
    public boolean isEmpty() {
        return nItems == 0;
    }

    /**
     * 队列是否满
     *
     * @return
     */
    public boolean isFull() {
        return nItems == maxSize;
    }

    /**
     * 队列元素个数
     *
     * @return
     */
    public int size() {
        return nItems;
    }
}
