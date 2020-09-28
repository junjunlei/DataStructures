package com.standard.tree.defin;

import java.util.LinkedList;

/**
 * 二叉查找树
 *
 * @author Jerry
 * @create 2020-09-02 13:23
 */
public class BinaryTree {
    /**
     * 二叉树根节点
     */
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public BinaryTree() {
    }

    public void put(TreeNode node) {
        if (root == null) {
            root = node;
        } else {
            TreeNode cur = root;
            TreeNode parent;
            while (true) {
                parent = cur;
                if (cur.val > node.val) {
                    cur = cur.left;
                    if (cur == null) {
                        parent.left = node;
                        return;
                    }
                } else if (cur.val < node.val) {
                    cur = cur.right;
                    if (cur == null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }

    /**
     * 打印搜索二叉树
     */
    public void showRoot(){
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.addLast(root);
        //下一层节点的数量
        int nextLevel = 0;
        //当前层中还没有打印的节点数
        int toBePrinted = 1;
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.print(node.val+" ");
            if(node.left!=null){
                queue.addLast(node.left);
                nextLevel++;
            }
            if(node.right!=null){
                queue.addLast(node.right);
                nextLevel++;
            }
            toBePrinted--;
            if(toBePrinted == 0){
                System.out.println();
                toBePrinted = nextLevel;
                nextLevel = 0;
            }
        }
        //System.out.println(root);
    }

}
