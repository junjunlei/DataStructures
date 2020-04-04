package com.jerry.sparsearray;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author Jerry
 * @create 2020-03-04 14:34
 */
public class DateTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2020, 03, 1);
        Date date1=new Date();
        LocalDate toLocalDate = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(toLocalDate);
        Period between = Period.between(now, date);
        Period between1 = Period.between(now, toLocalDate);
        System.out.println(between1.getDays());

    }
}
