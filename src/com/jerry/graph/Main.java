package com.jerry.graph;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

/**
 * @author Jerry
 * @create 2020-07-25 11:55
 */
public class Main {
    private static ScheduledThreadPoolExecutor pool=new ScheduledThreadPoolExecutor(5, Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) {
        List<User> list =new ArrayList<>();
        User user=new User(1L,"2");
        User user1=new User(null,"3");
        list.add(user1);
        list.add(user);
        List<User> list1 = list.stream().filter(e -> e.getId() == null).collect(Collectors.toList());
        System.out.println(list1);

    }
}
