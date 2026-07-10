package com.example.jdbc;

import java.security.Provider;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            Service service=new ServiceImpl();
            while(true) {
                System.out.print("Welcome to curd API");
                System.out.println("1.Create database");
                System.out.println("2.Create Table");
                System.out.println("3.Insert Table");
                System.out.println("4.Update Table");
                System.out.println("5.Delete Table");
                System.out.println("6.Reterive Table");
                System.out.println("7.Exit");
                System.out.print("Enter choice: ");
                int choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the name of the database");
                        String dbname = input.nextLine();
                        String dbName = "79";
                        Service.createDatabase(dbName);
                        break;
                    case 7:
                        System.out.println("Exit");
                        break;



                }
            }
        }
    }
}