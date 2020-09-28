package com.standard.tree.defin;

/**
 * @author Jerry
 * @create 2020-09-02 13:54
 */
public class Test {
    public static void main(String[] args) {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(5);
        TreeNode node6=new TreeNode(6);
        TreeNode node7=new TreeNode(7);
        BinaryTree bt=new BinaryTree();
        bt.put(node4);
        bt.put(node2);
        bt.put(node1);
        bt.put(node3);
        bt.put(node5);
        bt.put(node6);
        bt.put(node7);
        System.out.println("==================");
        bt.showRoot();
    }
}
