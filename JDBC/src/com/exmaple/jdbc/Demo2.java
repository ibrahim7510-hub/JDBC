package com.exmaple.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        try(Connection con=DBUtil.getConnection();){
            Statement st=con.createStatement();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter username");
            String username=sc.next();
            System.out.println("Enter password");
            String password=sc.next();
            String sql="select name,password from test where " +
                    "name='"+username+"'and password='"+password+"'";

            ResultSet rs=st.executeQuery(sql);
            if(rs.next()==false){
                System.out.println("Falsy Credential");
            }else{
                while(rs.next()){
                    System.out.println(rs.getString("name"));
                    System.out.println(rs.getString("password"));
                }

            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
