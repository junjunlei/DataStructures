package com.jerry.offer.ch3;

/**
 * 题3：
 * <p>
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * <p>
 * 思路：
 * <p>
 * 1.从右上角或者左下角 逐行查找
 * 2.二分法查找
 * 3.暴力查找
 *
 * @author Jerry
 * @create 2019-12-31 16:06
 */
public class Solution {
    public static void main(String[] args) {
        int [][]array=new int [][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find(10,array));
    }

    /**
     * 右上角查找法
     * @param target 目标值
     * @param array 源数组
     * @return 查找情况
     */
    public static boolean find(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        int row = 0;
        int column = array[row].length-1;
        while (row < array.length && column >= 0) {

            if (array[row][column] == target) {
                return true;
            }
            //当前位置值如果大于 目标值
            if (array[row][column] > target) {
                //左移
                column--;
            } else {
                //下移
                row++;
            }
        }
        return false;
    }
}
