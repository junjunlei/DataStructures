package com.interview.queue;

/**
 * 手写队列
 *
 * @author Jerry
 * @create 2020-07-07 15:21
 */
public interface Queue<T> {

    /**
     * 存数据
     *
     * @param item 入参
     * @return 操作结果
     */
    boolean put(T item);

    /**
     * 取数据 ，拿回一个泛型值
     *
     * @return
     */
    T take();

    /**
     * 队列本身的存储节点
     *
     * @param <T>
     */
    class Node<T> {

        //数据
        T item;

        //下一个元素
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }
    }
}
