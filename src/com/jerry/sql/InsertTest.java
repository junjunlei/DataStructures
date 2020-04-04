package com.jerry.sql;

import org.junit.Test;

import java.sql.*;
import java.util.Date;

public class InsertTest {
    private static String url = "jdbc:mysql://47.93.32.124:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&tinyInt1isBit=false&rewriteBatchedStatements=true";
    private static String user = "root";
    private static String password = "root";

    @Test
    public void insert() {
        Connection conn = null;
        // 开时时间
        Long begin = System.currentTimeMillis();
        // sql前缀
        String prefix = "INSERT INTO srm.scec_ec_product(ec_platform, ec_product_num,ec_product_name," +
                "ec_product_pool_num, ec_page_no, ec_category_id, catalog_id, item_id, agreement_price," +
                " market_price, naked_price, jd_price, tax_price, shelf_flag, product_status, specifications," +
                "model, primary_uom_id, secondary_uom_enabled, secondary_uom_id, uom_conversion_rate, gross_weight, " +
                "net_weight, weight_uom_id, tax_inclouded_flag, tax_id, tax_rate, product_area, common_name," +
                " manufacturer_name, remark, brand, supplier_agent, ware_qd, volume, volume_uom_id, imported_flag, upc_code," +
                " ean_code, used_product_code, product_level_code, effective_date_from, effective_date_to, currency_code, " +
                "shelf_life, frame_agreement_num, image_path, sale_unit, object_version_number, creation_date, created_by," +
                " last_updated_by, last_update_date, lowest_buy, spu_id, spu_name, is_ec_logistics, is_self, service_desc, " +
                "sale_actives, upc69 ) VALUES";
        try {
            conn = DriverManager.getConnection(url, user, password);
            // 保存sql后缀
            StringBuffer suffix = new StringBuffer();
            // 设置事务为非自动提交
            conn.setAutoCommit(false);
            // Statement st = conn.createStatement();
            // 比起st，pst会更好些
            PreparedStatement pst = conn.prepareStatement("");
            // 外层循环，总提交事务次数
            int x=14000001;
            for (int i = 1; i <= 300; i++) {
                // 第次提交步长
                for (int j = 1; j <= 10000; j++) {
                    // 构建sql后缀
                    suffix.append("(" + "'JD',"+
                            x+
                            ",'周大福',"+
                            "'6147',"+
                            "'2',"+
                            "'682',"+
                            "NULL,"+
                            "NULL,"+
                            "1460.6000000000,"+
                            "NULL,"+
                            "1292.5700000000,"+
                            "1460.6000000000,"+
                            "168.0300000000,"+
                            "1,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "0.100000,"+
                            "0.100000,"+
                            "NULL,"+
                            "NULL,"+
                            "3,"+
                            "13.00,"+
                            "'广东佛山',"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "'周大福',"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL,"+
                            "'jfs/t1/38986/7/5999/314718/5ccfeb54Ec1920476/052a922bb15c57af.jpg',"+
                            "NULL,"+
                            "1,"+
                            "'2020-01-17 13:56:04',"+
                            "-1,"+
                            "-1,"+
                            "'2020-01-17 13:56:04',"+
                            "1.000000,"+
                            "100005377072,"+
                            "'周大福',"+
                            "1,"+
                            "1,"+
                            "NULL,"+
                            "NULL,"+
                            "NULL" + "),");
                    x++;
                }
                // 构建完整sql
                String sql = prefix + suffix.substring(0, suffix.length() - 1);
                // 添加执行sql
                pst.addBatch(sql);
                // 执行操作
                pst.executeBatch();
                // 提交事务
                conn.commit();
                // 清空上一次添加的数据
                suffix = new StringBuffer();
            }
            // 头等连接
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 结束时间
        Long end = new Date().getTime();
        // 耗时
        System.out.println("cast : " + (end - begin) / 1000 + " s");
    }
}
