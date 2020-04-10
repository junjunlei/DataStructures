package com.jerry.sort;

import java.util.Arrays;

/**
 * @author Jerry
 * @create 2020-04-09 23:01
 */
public class BubbleSort {
    public static void main(String[] args) {
        int []arr={1,-1,3,5,4,8,7};
        sort(arr);
    }

    public static void sort(int[] source) {
        int temp;
        //外层循环表趟数
        for (int i = 1; i < source.length; i++) {
            //内层循环表每趟比较次数
            for (int j = 0; j < source.length - i; j++) {
                if(source[j]>source[j+1]){
                    temp=source[j+1];
                    source[j+1]=source[j];
                    source[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(source));
    }
}
