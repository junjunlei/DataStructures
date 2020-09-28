package com.standard.sort.selelct;

import java.util.Arrays;

/**
 * 选择排序
 * <p>
 * 原理：
 * 1.每次遍历过程中，都假定第一个索引处的元素是最小值，和其他索引处的值依次进行比较，如果索引处的值
 * 大于其他索引处的值，则假定其他某个索引处的值为最小，最后可以找到最小值所在的索引
 * 2.交换第一个索引处和最小索引处的值
 *
 * @author Jerry
 * @create 2020-09-28 11:28
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr={1,-1,3,5,4,8,7};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //时间复杂度O(n²) 不稳定排序

    private static void selectSort(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            int min = sortArray[i];
            int minIndex = i;
            for (int j = i + 1; j < sortArray.length; j++) {
                if (min > sortArray[j]) {
                    min = sortArray[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                sortArray[minIndex] = sortArray[i];
                sortArray[i] = min;
            }
        }
    }
}
