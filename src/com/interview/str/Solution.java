package com.interview.str;

/**
 * 单词反转
 */
public class Solution {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String re = reverse(str);
        StringBuffer sb = new StringBuffer();
        //根据空格拆分
        String[] s = re.split(" ");
        //再次反转 就把单词转回来了
        for (int i = 0; i < s.length - 1; i++) {
            sb.append(reverse(s[i]) + " ");
        }
        sb.append(reverse(s[s.length - 1]));
        return String.valueOf(sb);
    }

    public String reverse(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return String.valueOf(sb);
    }
}