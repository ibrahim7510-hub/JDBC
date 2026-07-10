package com.jdbc.Util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner sc = new Scanner(System.in);

    public static int readInt() {
        return sc.nextInt();
    }

    public static String readString() {
        sc.nextLine(); // clear buffer
        return sc.nextLine();
    }

    public static String readDate() {
        sc.nextLine(); // clear buffer
        return sc.nextLine();
    }
}