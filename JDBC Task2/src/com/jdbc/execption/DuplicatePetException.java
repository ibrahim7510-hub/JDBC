package com.jdbc.execption;

public class DuplicatePetException extends Exception {

    public DuplicatePetException(String message) {
        super(message);
    }

}