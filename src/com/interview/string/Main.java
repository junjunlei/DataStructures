package com.interview.string;

/**
 * @author Jerry
 * @create 2020-08-21 13:52
 */
public class Main {
    public static void main(String[] args) {
        String s1=new String("1");
        s1.intern();
        String s2="1";
        System.out.println(s1==s2);

        String s3=new String("1")+new String("1");
        String s4="11";
        s3.intern();
        System.out.println(s3==s4);
    }
}
