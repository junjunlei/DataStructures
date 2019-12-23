package com.jerry.sparsearray;

/**
 * 稀疏数组
 * 需求：编写五子棋程序  有存盘退出和续上盘功能
 * 分析：因为有很多数据都是默认为0，记录了很多没有意义得数据，所以需要用稀疏数组
 *
 * @author Jerry
 * @create 2019-08-14 18:50
 */
public class SparseArray {
    public static void main(String[] args) {
        //创建一个原始数组 11*11
        //0表示，没有棋子  1表示黑子 2表示白子
        int [][]chessArray = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;

        //输出二维数组
        System.out.println("原始的二维数组为：");
        for (int[] row : chessArray) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        //转换为稀疏数组
        //1.遍历得到有效数据个数
        int sum = 0;
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[0].length; j++) {
                if (chessArray[i][j] != 0) {
                    sum++;
                }
            }
        }
        //2.创建对应的稀疏数组
        //列分别存 行数 列数 值(第一行存总行数 总列数 有效值个数)
        int [][]sparseArray = new int[sum + 1][3];
        //给稀疏数组赋值  --->第一行
        sparseArray[0][0] = chessArray.length;
        sparseArray[0][1] = chessArray[0].length;
        sparseArray[0][2] = sum;
        //遍历二维数组chessArray 将非0的数据存入稀疏数组sparseArray
        int count = 0;
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[0].length; j++) {
                if (chessArray[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray[i][j];
                }
            }
        }
        //输出稀疏数组
        System.out.println("得到的稀疏数组为：");
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArray[i][0], sparseArray[i][1], sparseArray[i][2]);
        }

        //稀疏数组恢复成二维数组
        //1.读取稀疏数组第一行数据 创建二维数组
        int [][]chessArray2 = new int[sparseArray[0][0]][sparseArray[0][1]];
        //2.读取稀疏数组后几行的数据 赋值给二维数组
        for (int i = 1; i < sparseArray.length; i++) {
            chessArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        //输出恢复后的稀疏数组
        System.out.println("恢复后的二维数组为：");
        for (int[] row : chessArray2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
