package com.jerry.offer.ch4;

import java.util.Arrays;
import java.util.Stack;

/**
 * 题4：
 *
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 思路：
 *
 * @author Jerry
 * @create 2019-12-31 16:38
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(replace("We  Are    Happy"));
    }
    public static String replace(String str){
        if(str.isEmpty()){
            return null;
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(" ".equals(String.valueOf(str.charAt(i)))){
             sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
