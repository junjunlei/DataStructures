package com.interview.test;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Jerry
 * @create 2020-07-09 17:13
 */
public class Test {
    public static void main(String[] args) {
       int [] a={1,2,3};
       int[] ints = Arrays.copyOf(a, 10);
        System.out.println(ints[0]);
        System.out.println(TimeZone.getDefault());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        System.out.println(sdf.format(new Date()));
    }
}
