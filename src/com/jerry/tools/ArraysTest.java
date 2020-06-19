package com.jerry.tools;

import java.util.Arrays;

/**
 * @author Jerry
 * @create 2020-05-18 14:00
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] ints = Arrays.copyOfRange(arr, 1, 4);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println();
    }
}
