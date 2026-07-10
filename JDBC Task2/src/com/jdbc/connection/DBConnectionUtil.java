package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/pet_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Ibrahim@123";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Database Connection Failed");
            return null;
        }

    }

}