package com.jerry.offer;

/**
 * @author Jerry
 * @create 2020-01-15 16:02
 */
public class test {
    public static void main(String[] args) {
        String str="We Are Happy";
//        String x = str.replace(" ", "%20");
//        System.out.printf(x);
        StringBuffer stringBuffer = new StringBuffer(str);



        String[] split = str.split("");

        int i=0;
        for (String s : split) {
            if("".equals(s)){
                split[i]="%20";
            }
            i++;
        }
        for (String s : split) {
            String x;

        }

        System.out.printf(split.toString());
    }
}
