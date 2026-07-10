package com.jdbc.execption;

public class PetNotFoundException extends Exception {

    public PetNotFoundException(String message) {
        super(message);
    }

}