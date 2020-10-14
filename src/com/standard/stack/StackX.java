package com.standard.stack;

/**
 * 栈
 *
 * @author Jerry
 * @create 2020-10-14 15:02
 */
public class StackX {

    /**
     * 栈容量
     */
    private int maxSize;
    /**
     * 保存元素的数据
     */
    private long[] stackArray;
    /**
     * 栈顶
     */
    private int top;

    public StackX(int capacity) {
        this.maxSize = capacity;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    /**
     * 压栈
     *
     * @param item
     */
    public void push(long item) {
        if(isFull()){
            throw new RuntimeException("栈已满");
        }
        stackArray[++top] = item;
    }

    /**
     * 弹栈
     *
     * @return
     */
    public long pop() {
        if(isEmpty()){
            throw new RuntimeException("栈已空");
        }
        return stackArray[top--];
    }

    /**
     * 查看栈顶元素
     *
     * @return
     */
    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
