package com.jerry.tree;

import java.util.Stack;

/**
 * 二叉树
 * <p>
 * 前序遍历
 * 1.先输出当前节点（初始是root节点）
 * 2.如果左子节点不为空，则递归前序遍历
 * 3.如果右子节点不为空，则递归后序遍历
 * <p>
 * 中序遍历
 * 1.如果当前节点的左子节点不为空，则递归中序遍历
 * 2.输出当前节点
 * 3.如果当前节点的右子节点不为空，则递归中序遍历
 * 后序遍历
 * 1.如果当前节点的左子节点不为空，则递归后序遍历
 * 2.如果当前节点的右子节点不为空，则递归后续序遍历
 * 3.输出当前节点
 *
 * @author Jerry
 * @create 2020-03-25 15:18
 */
public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }


    /**
     * 后续遍历非递归
     */
    public void post(){
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            root = stack1.pop();
            stack2.push(root);
            if(root.getLeft()!=null){
                stack1.push(root.getLeft());
            }
            if(root.getRight()!=null){
                stack1.push(root.getRight());
            }
        }
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }

    }

    /**
     * 中序遍历非递归
     */
    public void infix(){
        Stack<Node> stack=new Stack<>();
        while (!stack.isEmpty()||root!=null){
            while (root!=null){
                stack.push(root);
                root=root.getLeft();
            }
            if(!stack.isEmpty()){
                Node node = stack.pop();
                System.out.println(node);
                root=node.getRight();
            }
        }

    }

    /**
     * 前序遍历非递归
     */
    public void pre(){
        Stack<Node> stack=new Stack<>();
        while (!stack.isEmpty()||root!=null){
         while (root!=null){
             System.out.println(root);
             stack.push(root);
             root=root.getLeft();
         }
         if(!stack.isEmpty()){
             Node node = stack.pop();
             root=node.getRight();
         }
        }

    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }

    }

    /**
     * 中序遍历
     */
    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }

    }

    /**
     * 后序遍历
     */
    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }


    /**
     * 前序遍历查找
     *
     * @param no
     * @return
     */
    public Node preOrderSearch(int no) {
        if (root != null) {
            return root.preOrderSearch(no);
        } else {
            return null;
        }
    }

    /**
     * 中序遍历查找
     *
     * @param no
     * @return
     */
    public Node infixOrderSearch(int no) {
        if (root != null) {
            return root.infixOrderSearch(no);
        } else {
            return null;
        }
    }

    /**
     * 后续遍历查找
     *
     * @param no
     * @return
     */
    public Node postOrderSearch(int no) {
        if (root != null) {
            return this.root.postOrderSearch(no);
        } else {
            return null;
        }
    }

    //删除结点
    public void delNode(int no) {
        if(root != null) {
            //如果只有一个root结点, 这里立即判断root是不是就是要删除结点
            if(root.getNo() == no) {
                root = null;
            } else {
                //递归删除
                root.delNode(no);
            }
        }else{
            System.out.println("空树，不能删除~");
        }
    }

}
