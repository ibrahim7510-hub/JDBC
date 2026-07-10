package com.example.jdbc;

public interface Service {

    void createDatabase(String dbName);

    void createTable();
    void insertData(Student student);
    void update(String regNo, String name);
    void delete(String regNo);
    void findAll();
}