package com.exmaple.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.SequencedCollection;

public class Demo1 {
    public static void main(String[]args){
        String jdbcUrl="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="Ibrahim@123";
        Scanner sc=new Scanner(System.in);
        try (Connection con= DriverManager.getConnection(jdbcUrl,username,password);
             Statement statement=con.createStatement()
        ){
            if (con==null){
                System.out.println("Connection failed");
            }else {
                System.out.println("Connected to database");
                System.out.println("Enter ID:");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Name");
                String name=sc.nextLine();
                System.out.println("Enter Country");
                String country = sc.nextLine();
                System.out.println("Enter Score");
                int score=sc.nextInt();
                String sql="insert into customers(id,first_name,country,score) values('"+id+"','"+name+"','"+country+"','"+score+"')";
                int rowAffected=statement.executeUpdate(sql);
                if (rowAffected==1){
                    System.out.println("Inserted successfully");
                }else {
                    System.out.println("Insert failed");
                }
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }

    }
}
