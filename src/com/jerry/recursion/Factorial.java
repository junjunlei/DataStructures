package com.jerry.recursion;

/**
 * 阶乘
 * @author Jerry
 * @create 2020-04-23 12:36
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }else {
            return (n*factorial(n-1));
        }
    }
}
