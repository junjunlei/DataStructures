package com.jerry.graph;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 图
 *
 * @author Jerry
 * @create 2020-08-30 14:37
 */
public class Graph {

    /**
     * 图的顶点集合
     */
    private ArrayList<String> vertexList;

    /**
     * 存储图的邻接矩阵
     */
    private int[][] edges;


    /**
     * 记录某个顶点是否被访问
     */
    private boolean[] isVisted;

    public Graph(int n) {
        vertexList = new ArrayList(n);
        edges = new int[n][n];
        isVisted=new boolean[n];
    }

    /**
     * 添加顶点
     * @param vertex
     */
    public void addVertex(String vertex) {
        vertexList.add(vertex);
    }

    /**
     * 新增边
     * @param start
     * @param end
     */
    public void addEdges(int start, int end) {
        edges[start][end] = 1;
        edges[end][start] = 1;
    }

    /**
     * 输出图
     */
    public void showGraph() {
        for (int[] edge : edges) {
            System.out.println(Arrays.toString(edge));
        }
    }

    /**
     * 获取当前顶点的第一个邻接点
     * @param index
     * @return
     */
    public int getFirstNeighbor(int index){
        for(int j=0;j<vertexList.size();j++){
            if(edges[index][j]==1&& isVisted[j]==false){
                return j;
            }
        }
        return -1;
    }

    /**
     * 深度优先算法
     */
    public void dfs(){
        Stack<Integer> stack; stack=new Stack();
        //第一个邻接点开始
        isVisted[0]=true;
        System.out.print(vertexList.get(0)+" ");
        stack.push(0);
        while (!stack.isEmpty()){
            int v = getFirstNeighbor(stack.peek());
            if(v==-1){
                stack.pop();
            }else {
                isVisted[v]=true;
                System.out.print(vertexList.get(v)+" ");
                stack.push(v);
            }
        }
        /**
         * 重置flag，方便后续使用dfs
         */
        for (int j=0;j<vertexList.size();j++){
            isVisted[j]=false;
        }
    }

    /**
     * 广度优先算法
     */
    public void bfs(){
        LinkedList<Integer> queue=new LinkedList<>();
        //第一个邻接点开始
        isVisted[0]=true;
        queue.addLast(0);
        System.out.print(vertexList.get(0)+" ");
        int v2;
        while (!queue.isEmpty()){
            Integer v1 = queue.remove();
            while ((v2=getFirstNeighbor(v1))!=-1){
                isVisted[v2]=true;
                System.out.print(vertexList.get(v2)+" ");
                queue.addLast(v2);
            }
        }
        /**
         * 重置flag，方便后续使用bfs
         */
        for (int j=0;j<vertexList.size();j++){
            isVisted[j]=false;
        }
    }


    public static void main(String[] args) {
        Graph graph = new Graph(8);
        //测试创建图
        String[] vertexes = {"A", "B", "C", "D", "E","F","G","H"};
        for (String vertex : vertexes) {
            graph.addVertex(vertex);
        }

        /**
         *
         *                  A
         *
         *           B             C
         *
         *      D       E     F       G
         *
         *          H
         *
         *
         */
        //创建边
        //A-B
        graph.addEdges(0, 1);
        //A-C
        graph.addEdges(0, 2);
        //B-D
        graph.addEdges(1, 3);
        //B-E
        graph.addEdges(1, 4);
        //D-H
        graph.addEdges(3, 7);
        //F-H
        graph.addEdges(4, 7);
        //C-F
        graph.addEdges(2, 5);
        //C-F
        graph.addEdges(2, 6);
        //F-G
        graph.addEdges(5, 6);
        //输出图
        graph.showGraph();

        //A B D H E C F G
        graph.dfs();
        System.out.println();
        //A B C D E F G H
        graph.bfs();
    }
}
