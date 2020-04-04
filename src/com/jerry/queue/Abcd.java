package com.jerry.queue;

import java.math.BigDecimal;

/**
 * @author Jerry
 * @create 2020-02-11 14:47
 */
public class Abcd {
    public static void main(String[] args) {
        BigDecimal bigDecimal=new BigDecimal("1.123456789016");
        BigDecimal bigDecimal1 = bigDecimal.setScale(10,BigDecimal.ROUND_DOWN);
        System.out.println(bigDecimal1);
    }
}
