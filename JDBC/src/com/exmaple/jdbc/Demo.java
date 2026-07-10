package com.exmaple.jdbc;

import java.sql.*;

public class Demo {
    public static void main(String[]args){
        String jdbcUrl="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="Ibrahim@123";

        try(Connection con= DriverManager.getConnection(jdbcUrl,username,password)) {
            Statement statement=con.createStatement();
            String sql="select * from customers";
            ResultSet rs=statement.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("first_name"));
                System.out.println(rs.getString("country"));
                System.out.println(rs.getInt("score"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}