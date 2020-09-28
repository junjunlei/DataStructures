package com.standard.sort.bubble;

import java.util.Arrays;

/**
 * 冒泡排序
 * <p>
 * 原理：
 * 1.比较相邻的元素，如果前一个元素大，就交换位置。
 * 2.对每个元素做相同的工作，从开始第一队元素到结尾最后一队元素。
 *
 * @author Jerry
 * @create 2020-09-28 10:46
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={1,-1,3,5,4,8,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //时间复杂度O(n²)  稳定排序 1 1 并不会改变位置

    private static void bubbleSort(int[] sortArray) {
        int temp;
        //外层循环表示比较的趟数
        for (int i = 1; i < sortArray.length; i++) {
            //内层循环表示比较的次数
            for (int j = 0; j < sortArray.length - i; j++) {
                if (sortArray[j] > sortArray[j + 1]) {
                    temp = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = temp;
                }
            }
        }
    }
}
