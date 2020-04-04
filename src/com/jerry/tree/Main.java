package com.jerry.tree;

/**
 * @author Jerry
 * @create 2020-03-25 15:18
 */
public class Main {
    public static void main(String[] args) {
        //创建节点
        Node root = new Node(1, "代磊");
        Node nodeOne = new Node(2, "崔雄赫");
        Node nodeTwo = new Node(3, "雷俊俊");
        Node nodeThree = new Node(4, "刘凡");
        Node nodeFour = new Node(5, "刘哲");
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
        root.setLeft(nodeOne);
        root.setRight(nodeTwo);
        nodeTwo.setLeft(nodeThree);
        nodeTwo.setRight(nodeFour);
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

        Node node = binaryTree.preOrderSearch(3);
        System.out.println(node);
        Node node1 = binaryTree.infixOrderSearch(3);
        System.out.println(node1);
        Node node2 = binaryTree.postOrderSearch(3);
        System.out.println(node2);

        binaryTree.delNode(3);
        //binaryTree.postOrder();


    }
}
