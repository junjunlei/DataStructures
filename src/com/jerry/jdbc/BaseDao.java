package com.jerry.jdbc;

import java.sql.*;

/**
 * 批量插入1000万条数据测试
 *
 * @author Jerry
 * @create 2020-01-14 15:43
 */
public class BaseDao {

    private static Connection con = null;
    private static PreparedStatement psmt = null;
    public ResultSet rs = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        getConnection();
        try {
            con.setAutoCommit(false);
            psmt = con.prepareStatement("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://47.93.32.124:3306/test", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }



    /**
     * 多条记录插入操作
     */
    public boolean affectRowMore1(String sql, long flag) {
        try {
            psmt.addBatch(sql);
            // 执行操作
            int[] counts = psmt.executeBatch();
            con.commit(); // 提交到数据库
            for (int i : counts) {
                if (i == 0) {
                    con.rollback();
                    return false;
                }
            }
            closeAll(flag);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void closeAll(long flag) {

        try {
            if (con != null && flag == -1) {
                con.setAutoCommit(true);
                con.close();
            }
            if (psmt != null && flag == -1) {
                psmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public boolean insertMore1(String sql_suffix,long flag) {
        String sql_prefix = "insert into t_user(id,name,sex,phone,password) values ";
        return affectRowMore1(sql_prefix + sql_suffix,flag);
    }
}
