package com.standard.stack;

/**
 * @author Jerry
 * @create 2020-10-14 15:23
 */
public class StackMain {
    public static void main(String[] args) {
        StackX stack = new StackX(5);
        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
