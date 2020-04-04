package com.jerry.tree;

/**
 * 二叉树的节点
 *
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

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }


    public void preOrder() {
        System.out.println(this);
        //递归左子树前序遍历
        if (this.left != null) {
            this.left.preOrder();
        }
        //递归右子树前序遍历
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    public void infixOrder() {

        //递归遍历左子树
        if (this.left != null) {
            this.left.infixOrder();
        }
        //输出根节点
        System.out.println(this);
        //递归遍历右子树
        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    public void postOrder() {

        //递归遍历左子树
        if (this.left != null) {
            this.left.postOrder();
        }
        //递归遍历右子树
        if (this.right != null) {
            this.right.postOrder();
        }
        //输出根节点
        System.out.println(this);

    }

    /**
     * 前序遍历查找树
     *
     * @param no 编号
     * @return 找到就返回节点 没找到就返回null
     */
    public Node preOrderSearch(int no) {
        System.out.println("进入前序遍历找");
        if (this.no == no) {
            return this;
        }
        //辅助节点 存储查找结果
        Node result = null;
        if (this.left != null) {
            result = this.left.preOrderSearch(no);
        }
        // 左子树找到
        if (result != null) {
            return result;
        }
        //左子树没找到 右子树找
        if (this.right != null) {
            result = this.right.preOrderSearch(no);
        }
        return result;
    }

    /**
     * 中序遍历查找树
     *
     * @param no 编号
     * @return 找到就返回节点 没找到就返回null
     */
    public Node infixOrderSearch(int no) {

        //辅助节点 存储查找结果
        Node result = null;
        if (this.left != null) {
            result = this.left.infixOrderSearch(no);
        }
        if (result != null) {
            return result;
        }
        System.out.println("进入中序遍历找");
        if (this.no == no) {
            return this;
        }

        if (this.right != null) {
            result = this.right.infixOrderSearch(no);
        }
        return result;
    }

    /**
     * 后序遍历查找树
     *
     * @param no 编号
     * @return 找到就返回节点 没找到就返回null
     */
    public Node postOrderSearch(int no) {

        //辅助节点 存储查找结果
        Node result = null;
        if (this.left != null) {
            result = this.left.postOrderSearch(no);
        }
        if (result != null) {
            return result;
        }
        if (this.right != null) {
            result = this.right.postOrderSearch(no);
        }
        if (result != null) {
            return result;
        }
        System.out.println("进入后序遍历找");
        if (this.no == no) {
            return this;
        }
        return null;
    }

    /**
     * 递归删除结点
     * 1.如果删除的节点是叶子节点，则删除该节点
     * 2.如果删除的节点是非叶子节点，则删除该子树
     *
     * @param no
     */
    public void delNode(int no) {

        //思路
		/*
		 * 	1. 因为我们的二叉树是单向的，所以我们是判断当前结点的子结点是否需要删除结点，而不能去判断当前这个结点是不是需要删除结点.
			2. 如果当前结点的左子结点不为空，并且左子结点 就是要删除结点，就将this.left = null; 并且就返回(结束递归删除)
			3. 如果当前结点的右子结点不为空，并且右子结点 就是要删除结点，就将this.right= null ;并且就返回(结束递归删除)
			4. 如果第2和第3步没有删除结点，那么我们就需要向左子树进行递归删除
			5.  如果第4步也没有删除结点，则应当向右子树进行递归删除.

		 */

		//2.如果当前结点的左子结点不为空，并且左子结点 就是要删除结点，就将this.left = null; 并且就返回(结束递归删除)
        if (this.left != null && this.left.no == no) {
            this.left=null;
            return;
        }

        //3.如果当前结点的右子结点不为空，并且右子结点 就是要删除结点，就将this.right= null ;并且就返回(结束递归删除)
        if (this.right != null && this.right.no == no) {
            this.right=null;
            return;
        }
        //4.左子树递归删除
        if(this.left!=null){
            this.left.delNode(no);
        }
        //5.右子树递归删除
        if(this.right!=null){
            this.right.delNode(no);
        }
    }
}
