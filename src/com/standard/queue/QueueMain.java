package com.standard.queue;

/**
 * @author Jerry
 * @create 2020-10-14 16:19
 */
public class QueueMain {
    public static void main(String[] args) {
        QueueX queue=new QueueX(5);
        queue.insert(10);
        queue.insert(9);
        queue.insert(8);
        queue.insert(7);
        queue.insert(6);
        queue.remove();
        queue.insert(5);

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
