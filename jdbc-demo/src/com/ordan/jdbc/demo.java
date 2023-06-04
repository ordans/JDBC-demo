package com.ordan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/university dormitory?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "UPDATE student SET age = 21 WHERE id = 43;";
        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);//返回受影响的行数

        System.out.println(count);

        stmt.close();
        conn.close();




    }
}
