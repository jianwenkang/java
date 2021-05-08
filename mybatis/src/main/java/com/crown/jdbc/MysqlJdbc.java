package com.crown.jdbc;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MysqlJdbc {

    public void demo() throws Exception {
        //第一步：注册驱动
        //第一种方式：类加载(常用)
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.100.241:3306/em_3", "HR", "HR");
        System.out.println(connection);
    }

    public void demo1() throws Exception {
        Driver driver = new Driver();
        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "zwnh0i32qs");
        Connection connection = driver.connect("jdbc:mysql://192.168.100.241:3306/em_3", info);
        System.out.println(connection);
    }
}
