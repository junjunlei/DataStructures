package com.jerry.jdbc;

import java.util.UUID;

/**
 * @author Jerry
 * @create 2020-01-14 17:05
 */
public class Main {
    public static void main(String[] args) {
        insertBenchMark1();
    }

    public static void insertBenchMark1() {
        BaseDao userDao = new BaseDao();
        long start = System.currentTimeMillis();
        StringBuffer suffix = new StringBuffer();
        long row = 1;
        for (int j = 0; j < 1000; j++) {
            for (int i = 0; i < 10000; i++) {
                String uuid = UUID.randomUUID().toString();
                String name = "张飞";
                name=name.concat(UUID.randomUUID().toString());
                int sex;
                if (Math.random() < 0.51) {
                    sex = 1;
                } else {
                    sex = 0;
                }
                String phone = "18200000000";
                suffix.append("(" + row + ",'" + name + "'," + sex + ",'" + phone + "','" + uuid + "'),");
                row++;
            }
            boolean b = userDao.insertMore1(suffix.substring(0, suffix.length() - 1), j);
            if (!b) {
                System.out.println("出错了----");
                System.exit(0);
            } else {
                // 清空上一次添加的数据
                suffix = new StringBuffer();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("生成1000万条数据共花费" + (end - start) + "毫秒");
    }
}
