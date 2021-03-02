package com.example.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcTest {

    private static final String username="root";

    private static final String password="";

    private static final String url="jdbc:mysql://localhost:3306/ruiz?useUnicode=true&characterEncoding=UTF-8&serverTimezone=PRC";

    private static final String driver="com.mysql.jdbc.Driver";

    public static Connection open()  {
        Connection conn=null;
        try {
            Class.forName(driver);
            conn= DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.getStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection connection=DriverManager.getConnection(url,username,password);

        System.out.println(connection);
    }
}
