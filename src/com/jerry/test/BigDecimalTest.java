package com.jerry.test;

import java.math.BigDecimal;

/**
 * @author Jerry
 * @create 2020-05-19 11:01
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal zero=BigDecimal.ZERO;
        BigDecimal one = zero.add(new BigDecimal(1));
        System.out.println(zero);
        System.out.println(one);

    }
}
