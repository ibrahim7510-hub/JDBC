package com.example.jdbc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Scanner;

@Setter
@Getter
public class InputUtil {
    public static String Dbname;
    public static String createDB(Scanner sc) {
        String db = sc.nextLine();
        Dbname = db;
        return db;
    }

    public static String getDbname() {
        return "";
    }
}