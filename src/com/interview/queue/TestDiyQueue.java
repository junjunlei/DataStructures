package com.interview.queue;

import java.util.concurrent.*;

/**
 * @author Jerry
 * @create 2020-07-07 16:14
 */
public class TestDiyQueue {
    private  final static DiyQueue<String> queue=new DiyQueue<>();
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 1000; i++) {
            if(i%2==0){
                int finalI = i;
                executor.submit(()->{
                     queue.put(finalI +"");
                    System.out.println("生产者生产消息"+"<=========>"+finalI);
                });
                continue;
            }
            executor.submit(()->{
                String take = queue.take();
                System.out.println("消费者消费消息"+":"+ take);
            });
        }
        executor.shutdown();
    }
}
