package com.interview.string;

/**
 * @author Jerry
 * @create 2020-08-21 15:20
 */
public class TryCatchTest {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        int temp = 10;
        try {
            System.out.println(temp/0);
        } catch (Exception e) {
            temp=30;
            return temp;
        } finally {
            temp=40;
        }
        return temp;
    }
}
