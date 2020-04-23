package com.jerry.offer.o1;

/**
 * @author Jerry
 * @create 2020-04-19 12:25
 */
public class AutoIncrement {
    public static void main(String[] args) {
        int i=1;
        i=i++;
        int j=i++;
        int k=i+ ++i*i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);

    }
}
