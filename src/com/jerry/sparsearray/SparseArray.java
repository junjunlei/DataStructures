package com.jerry.sparsearray;
/**
 * 稀疏数组
 * @author Jerry
 * @create 2019-08-14 18:50
 */
public class SparseArray {
    public static void main(String[] args) {
        //创建一个原始数组 11*11
        //0表示，没有棋子  1表示黑子 2表示白子
        int chessArray[][]=new int[11][11];
        chessArray[1][2]=1;
        chessArray[2][3]=2;
        //输出二维数组
        for(int []row :chessArray){
           for(int data:row){
               System.out.print(data+" ");
           }
            System.out.println();
        }
    }
}
