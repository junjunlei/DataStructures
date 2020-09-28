package com.standard.tree.defin;

/**
 * 二叉树结点TreeNode
 *
 * @author Jerry
 * @create 2020-09-02 12:37
 */
public class TreeNode {

    /**
     * 值
     */
    int val;
    /**
     * 左子树
     */
    TreeNode left;
    /**
     * 右子树
     */
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
