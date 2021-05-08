package com.crown.jdbc;

import oracle.jdbc.OracleDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

public class OracleJdbc {

    public void demo() throws Exception {
        //第一步：注册驱动
        //第一种方式：类加载(常用)
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.222.12:1521:xe", "HR", "HR");
        System.out.println(connection);
    }

    public void demo1() throws Exception {
        //第二种方式：利用Driver对象
        Driver driver = new OracleDriver();
        Properties info = new Properties();
        info.put("user", "HR");
        info.put("password", "HR");
        Connection connection = driver.connect("jdbc:oracle:thin:@192.168.222.12:1521:xe", info);
        System.out.println(connection);
    }


}
