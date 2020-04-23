package com.jerry.recursion;

/**
 * 杨辉三角      *
 *              **
 *              ***
 *              ****
 *              *****
 *              ******
 * @author Jerry
 * @create 2020-04-23 12:24
 */
public class Triangle {

    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
    public static int recursion(int n) {
        if (n == 1) {
            System.out.println("返回"+n);
            return n;
        } else {
            int temp = n + recursion(n - 1);
            System.out.println("返回temp=" + temp);
            return temp;
        }
    }
}
