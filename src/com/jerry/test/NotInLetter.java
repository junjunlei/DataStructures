package com.jerry.test;


import java.util.ArrayList;
import java.util.List;

/**
 * 找出不在数组中的26个字母
 *
 * @author Jerry
 * @create 2020-04-26 14:40
 */
public class NotInLetter {

    public static void main(String[] args) {
        char[] source = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','k'};
        List<String> list = notIn(source);
        System.out.println(list);
    }

    public static List<String> notIn(char[] source) {
        boolean[] tag = new boolean[26];
        for (int i = 0; i < source.length; i++) {
            char upperCase = Character.toUpperCase(source[i]);
            int num = upperCase - 'A';
            tag[num] = true;
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < tag.length; i++) {
            List<String> list = new ArrayList<>(26);
            if (!tag[i]) {
                list.add(String.valueOf((char) (i + 65)));
            }
            res.addAll(list);
        }
        return res;
    }

}
