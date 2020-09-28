package com.jdk.long_api;



/**
 * @author Jerry
 * @create 2020-06-19 10:50
 */
public class Main {
    public static void main(String[] args) {
        int[] aa = new int[]{1, 2};
        for (int i = 0; i < aa.length; i++) {

        }
        System.out.println();

        Long one = 128L;
        Long two = 128L;
        //false
        System.out.println(one == two);

        Long three = 127L;
        Long four = 127L;

        //true 因为Long有cache，范围为-128到127
        System.out.println(three == four);
        System.out.println(three.equals(four));

        Long aLong = Long.valueOf(127);
        Long aLong1 = Long.valueOf(127);
        //true 因为Long有cache，范围为-128到127
        System.out.println(aLong == aLong1);

        long a = 1;
        Long b = new Long(1);
        Long c = Long.valueOf(1);

        //true
        System.out.println(a == b);
        //true
        System.out.println(a == c);
        //false
        System.out.println(b == c);


    }
}
