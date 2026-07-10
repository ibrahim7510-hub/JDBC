package com.exmaple.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo3 {
    public static void main(String[] args) {
        try(Connection con= DBUtil.getConnection())
        {
            String sql="insert into costumer values(?,?,?,?,)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,8);
            ps.setString(2,"Dega");
            ps.setString(3,"india");
            ps.setInt(4,6);
            int rowsAffected=ps.executeUpdate();
            if(rowsAffected==0)
            {
                System.out.println("insert successfully");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
