package com.example.jdbc;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class DBUtil {
    private static final String USER = "root";
    private static final String PASSWORD = "Ibrahim@123"; // Change to your MySQL password
    private static final String URL = "jdbc:mysql://localhost:3306/";

    public static Connection getConnectionToServer() throws SQLException {
        return getConnection(URL, USER, PASSWORD);
    }
    public static Connection getConnection(String url, String user, String password) throws SQLException {
        String dbname = InputUtil.getDbname();
        if(dbname==null){
            System.out.println("DB not set");
        }
        return DriverManager.getConnection(url+dbname, user, password);
    }

    public static Connection getConnection() {
        return null;
    }
}