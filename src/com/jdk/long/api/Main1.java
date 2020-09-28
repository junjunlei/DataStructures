package com.jdk.long_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Jerry
 * @create 2020-07-01 10:55
 */
public class Main1 {
    public static void main(String[] args) {
//        List<String> list =new ArrayList<>();
//        list.add("PrNum1111");
//        list.add("PrNum1112");
//        list.add("PrNum1113");
//        list.add("PrNum1114");
//        System.out.println(list.toString());
//        String s = list.toString().replaceAll(",", "、");
//        System.out.println(s);
//        String str="PrNum123、PrNum234";
//        System.out.println(str);

        String format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        System.out.println(format);

        System.out.println(new Date().toString());

    }
}
