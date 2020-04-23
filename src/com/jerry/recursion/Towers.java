package com.jerry.recursion;

/**
 * @author Jerry
 * @create 2020-04-23 13:05
 */
public class Towers {
    public static void main(String[] args) {
        doTowers(3,'A','B','C');
    }

    public static void doTowers(int n,char from,char inter,char to){
        if(n==1){
            System.out.println("盘 1 从 :"+from+"  移到 :"+to);
        }else {
            //将除去n的其他盘子移动到B
            doTowers(n-1,from,to,inter);
            //移动最大盘子到C
            System.out.println("盘 "+n+" 从 :"+from+ " 移到 :"+to);
            //将剩余的盘子移动到C
            doTowers(n-1,inter,from,to);
        }
    }
}
