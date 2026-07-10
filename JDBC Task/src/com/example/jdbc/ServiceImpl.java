package com.example.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceImpl implements Service{
    public void CreateDatabase(String dbName){
    }

    @Override
    public void createDatabase(String dbName) {
        String sql = "CREATE DATABASE IF NOT EXISTS `" + dbName + "`";
        try(Connection con=DBUtil.getConnectionToServer()){
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Database created or already exists");
            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void createTable() {
        String sql="CREATE TABLE IF NOT EXISTS `student`.`student1` (\n" +
                "  `id` INT NULL,\n" +
                "  `regNo` INT NOT NULL,\n" +
                "  `name` VARCHAR(45) NULL,\n" +
                "  `dept` VARCHAR(45) NULL,\n" +
                "  PRIMARY KEY (`id`, `regNo`));";
        try(Connection con= DBUtil.getConnection())
        {
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Table created or already exists");
            st.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void insertData(Student student) {

    }

    @Override
    public void update(String regNo, String name) {

    }

    @Override
    public void delete(String regNo) {

    }

    @Override
    public void findAll() {

    }
}
