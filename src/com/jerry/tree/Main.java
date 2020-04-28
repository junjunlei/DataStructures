package com.jerry.tree;

/**
 * @author Jerry
 * @create 2020-03-25 15:18
 */
public class Main {
    public static void main(String[] args) {
        //创建节点
        Node root = new Node(1, "代磊");
        Node node2 = new Node(2, "崔雄赫");
        Node node3 = new Node(3, "雷俊俊");
        Node node4 = new Node(4, "刘凡");
        Node node5 = new Node(5, "刘哲");
        Node node6 = new Node(6, "刘哲");
        Node node7 = new Node(7, "刘哲");
        Node node8 = new Node(8, "刘哲");
        /**
         *
         *                     1
         *                   /   \
         *                  2     3
         *                       / \
         *                      4   5
         *
         *
         */
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node4.setRight(node7);
        node3.setLeft(node5);
        node3.setRight(node6);
        node6.setLeft(node8);
        // 手动创建二叉树  后面递归创建
        BinaryTree binaryTree = new BinaryTree(root);


        System.out.println("===============前序遍历=================");
        //1 2 3 4 5
        binaryTree.preOrder();

        System.out.println("===============中序遍历=================");
        //2 1 4 3 5
        binaryTree.infixOrder();

        System.out.println("===============后序遍历=================");
        //2 4 5 3 1
        binaryTree.postOrder();

//        Node node = binaryTree.preOrderSearch(3);
//        System.out.println(node);
//        Node node1 = binaryTree.infixOrderSearch(3);
//        System.out.println(node1);
//        Node node2 = binaryTree.postOrderSearch(3);
//        System.out.println(node2);
//
//        binaryTree.delNode(3);
        //binaryTree.postOrder();


    }
}
