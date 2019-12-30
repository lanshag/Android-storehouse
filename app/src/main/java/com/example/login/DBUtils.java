package com.example.login;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

public class DBUtils {

    private static String driver = "com.mysql.jdbc.Driver";// MySql驱动

    //   private static String url = "jdbc:mysql://localhost:3306/mysql";

    private static String user = "root";// 用户名

    private static String password = "liang609";// 密码

    private static Connection getConn(String dbName) {

        Connection connection = null;
        try {
            Class.forName(driver);// 动态加载类
            String ip = "10.0.2.2";// 写成本机地址，不能写成localhost，同时手机和电脑连接的网络必须是同一个

            // 尝试建立到给定数据库URL的连接
            connection = DriverManager.getConnection("jdbc:mysql://" + ip + ":3306/" + dbName,
                    user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static HashMap<String, Object> getInfoByName(String name) {

        HashMap<String, Object> map = new HashMap<>();
        //        // 根据数据库名称，建立连接0o
        Connection connection = getConn("mysql");

        try {
            // mysql简单的查询语句。这里是根据MD_CHARGER表的NAME字段来查询某条记录
            String sql = "select * from user where name = ?";
//            String sql = "select * from MD_CHARGER";
            if (connection != null) {// connection不为null表示与数据库建立了连接
                PreparedStatement ps = connection.prepareStatement(sql);
                if (ps != null) {
                    // 设置上面的sql语句中的？的值为name
                    ps.setString(1, name);
                    // 执行sql查询语句并返回结果集
                    ResultSet rs = ps.executeQuery();
                    if (rs != null) {
                        int count = rs.getMetaData().getColumnCount();
                        Log.e("DBUtils", "列总数：" + count);
                        while (rs.next()) {
                            // 注意：下标是从1开始的
                            for (int i = 1; i <= count; i++) {
                                String field = rs.getMetaData().getColumnName(i);
                                map.put(field, rs.getString(field));
                            }
                        }
                        connection.close();
                        ps.close();
                        return map;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("DBUtils", "异常：" + e.getMessage());
            return null;
        }

    }
}

