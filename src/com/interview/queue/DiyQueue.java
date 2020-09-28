package com.interview.queue;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author Jerry
 * @create 2020-07-07 15:26
 */
public class DiyQueue<T> implements Queue<T> {

    /**
     * 队列头
     */
    private volatile Node<T> head;

    /**
     * 队列尾
     */
    private volatile Node<T> tail;

    /**
     * 自定义节点
     */
    class DiyNode extends Node<T>{

        public DiyNode(T item) {
            super(item);
        }
    }

    /**
     * 队列大小
     */
    private AtomicInteger size=new AtomicInteger(0);


    /**
     * 容量
     */
    private final Integer capacity;

    /**
     * 写锁
     */
    private ReentrantLock putLock=new ReentrantLock();

    /**
     * 读锁
     */
    private ReentrantLock takeLock=new ReentrantLock();

    /**
     * 无参构造，默认最大容量Integer.MAX_VALUE
     */
    public DiyQueue(){
        this.capacity=Integer.MAX_VALUE;
        head=tail=new DiyNode(null);
    }

    /**
     * 有参构造，可以设定容量大小
     * @param capacity
     */
    public DiyQueue(Integer capacity){
        if(capacity==null||capacity<0){
            throw new IllegalArgumentException();
        }
        this.capacity=capacity;
        head=tail=new DiyNode(null);
    }

    @Override
    public boolean put(T item) {
        //判空
        if (item == null) {
            return false;
        }
        try {
            //尝试加锁 300秒
            boolean lockSuccess = putLock.tryLock(300, TimeUnit.SECONDS);
            if (!lockSuccess) {
                return false;
            }
            if (size.get() >= capacity) {
                return false;
            }
            //放到队尾
            tail.next = new DiyNode(item);
            this.tail = tail.next;
            //计数
            size.incrementAndGet();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            putLock.unlock();
        }
    }

    @Override
    public T take() {
        if (size.get() == 0) {
            return null;
        }
        try {
            //加锁时间200
            boolean lockSuccess = takeLock.tryLock(200, TimeUnit.SECONDS);
            if (!lockSuccess) {
                throw new RuntimeException("加锁失败");
            }
            //拿到头节点的下一个节点
            Node expectHead = head.next;
            //拿到头节点的值
            T item = (T) expectHead.item;
            expectHead.item = null;
            head = expectHead;
            size.decrementAndGet();
            return item;
        } catch (Exception e) {
            return null;
        } finally {
            takeLock.unlock();
        }
    }
}
