package com.jerry.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jerry
 * @create 2020-05-18 14:00
 */
public class ArraysTest {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
//        int[] ints = Arrays.copyOfRange(arr, 1, 4);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }
//        System.out.println();

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        System.out.println(list);
        List<Integer> list1 = list.stream().filter(integer -> integer==1).collect(Collectors.toList());
        System.out.println(list1);
    }
}
