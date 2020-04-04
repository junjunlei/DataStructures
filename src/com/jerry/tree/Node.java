package com.jerry.tree;

/**
 *  二叉树的节点
 * @author Jerry
 * @create 2020-03-25 15:13
 */
public class Node {
    /**
     * 编号
     */
    private int no;
    /**
     * 名称
     */
    private String name;
    /**
     * 左子树
     */
    private Node left;
    /**
     * 右子树
     */
    private Node right;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
