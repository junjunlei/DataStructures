package com.jerry.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author Jerry
 * @create 2020-04-10 12:18
 */
public class SelectSort {

    public static void main(String[] args) {
        //int []arr={1,-1,3,5,4,8,7};
        int[] arr = new int[80000];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int) (Math.random() * 80000);
        }
        long start = System.currentTimeMillis();
        selectSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSortR(int[] source) {
        for (int i = 0; i < source.length-1; i++) {
            int min = source[i];
            int minIndex = i;
            for (int j=i+1;j<source.length;j++) {
                if(min>source[j]){
                    min=source[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                source[minIndex]=source[i];
                source[i]=min;
            }
        }
    }
}
