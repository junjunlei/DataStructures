package com.jerry.sort;

import java.util.Arrays;

/**
 * @author Jerry
 * @create 2020-08-28 16:44
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 2, 7, 6, 3, 4, 5, 8};
        int left = 0;
        int right = arr.length - 1;
        sort(arr, left, right);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int left, int right) {
        int l=left;
        int r=right;
        int pivot = arr[(left+right) / 2];
        int temp;
        //分组
        while(l<r){

            //在pivot的左边一直找,找到大于等于pivot值,才退出
            while( arr[l] < pivot) {
                l += 1;
            }
            //在pivot的右边一直找,找到小于等于pivot值,才退出
            while(arr[r] > pivot) {
                r -= 1;
            }
            //如果l >= r说明pivot 的左右两的值，已经按照左边全部是
            //小于等于pivot值，右边全部是大于等于pivot值
            if( l >= r) {
                break;
            }
            if(l>=r){
                break;
            }
            //交换
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            //如果交换完后，发现这个arr[l] == pivot值 相等 r--， 前移
            if(arr[l] == pivot) {
                r -= 1;
            }
            //如果交换完后，发现这个arr[r] == pivot值 相等 l++， 后移
            if(arr[r] == pivot) {
                l += 1;
            }

        }
        if(l==r){
            l++;
            r--;
        }
        //递归
        if(left<r){
            sort(arr,left,r);
        }
        //向右递归
        if(right > l) {
            sort(arr, l, right);
        }
    }
}
