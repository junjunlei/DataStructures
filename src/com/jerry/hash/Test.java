package com.jerry.hash;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Jerry
 * @create 2020-06-07 9:58
 */
public class Test {
    public static void main(String[] args) {
        Map map=new HashMap<String,String>();
        map.put(null,null);
        Object o = map.get(null);
        System.out.println(o);


       new  ConcurrentHashMap<>(16);
        new Hashtable<>();
    }
}
