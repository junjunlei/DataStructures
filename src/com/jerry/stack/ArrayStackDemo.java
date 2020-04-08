package com.jerry.stack;

/**
 * 数组实现栈
 *
 * @author Jerry
 * @create 2020-04-08 15:38
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.list();
        stack.pop();
        stack.list();
    }
}

class ArrayStack {
    /**
     * 栈的大小
     */
    private int maxSize;

    /**
     * 存栈的数组
     */
    private int[] stack;

    /**
     * 表示栈顶
     */
    private int top = -1;


    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    /**
     * 栈满
     *
     * @return
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }

    /**
     * 栈空
     *
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 入栈
     * @param value
     */
    public void push(int value) {
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }

    /**
     * 出栈
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空");
        }
        int value=stack[top];
        top--;
        return value;
    }

    public void list(){
        if(isEmpty()){
            return;
        }
        //从栈顶开始遍历
        for(int i=top;i>=0;i--){
            System.out.printf("stack[%d]=%d\n",i,stack[i]);
        }
    }

}
