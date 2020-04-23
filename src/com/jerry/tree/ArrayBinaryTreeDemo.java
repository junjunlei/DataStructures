package com.jerry.tree;

/**
 * 顺序存储二叉树测试
 * @author Jerry
 * @create 2020-04-17 15:47
 */
public class ArrayBinaryTreeDemo {
    public static void main(String[] args) {
        /**
         *
         * 第n个元素的左子节点为  2 * n + 1
         * 第n个元素的右子节点为  2 * n + 2
         * 第n个元素的父节点为  (n-1) / 2   
         *                1(0)
         *       2(1)             3(2)
         *   4(3)     5(4)    6(5)    7(6)
         *
         */
        int[] arr={1,2,3,4,5,6,7};
        ArrayBinaryTree binaryTree=new ArrayBinaryTree(arr);
        binaryTree.preOrder(0);
    }
}

/**
 * 顺序存储二叉树
 */
class ArrayBinaryTree{
    private int[] arr;

    public ArrayBinaryTree(int[] arr) {
        this.arr = arr;
    }
    public void preOrder(int index){
        if(arr==null||arr.length==0){
            return;
        }
        //根节点
        System.out.println(arr[index]);
        //左子节点
        if((index*2+1)<arr.length){
            this.preOrder(index*2+1);
        }
        if((index*2+2)<arr.length){
            preOrder(index*2+2);
        }
    }
}