package com.standard.sort.insert;

import java.util.Arrays;

/**
 * 插入排序
 * <p>
 * 原理：
 * 1.把所有元素分为两组，排序和未排序
 * 2.找到未排序的数组中的第一个元素，向已排序的数组在进行插入
 * 3.倒叙遍历已经排序的元素，依次和待插入的元素进行比较，直到找到一个元素小于待插入元素，
 * 就把这待插入元素放到这个位置，其他元素向后移动一位
 *
 * @author Jerry
 * @create 2020-09-28 12:07
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 0, 4, 8, 7};
        insertSort(arr);
       // System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] sortArray) {
        for (int i = 1; i < sortArray.length; i++) {
            //未排序数组第一个元素
            int temp = sortArray[i];
            int j = i;
            //倒叙遍历已排序数组，找到比当前元素小的元素
            while (j > 0 && sortArray[j - 1] >= temp) {
                sortArray[j] = sortArray[j - 1];
                j--;
            }
            sortArray[j]=temp;
            System.out.println(Arrays.toString(sortArray));
        }
    }
}
