package com.epam.mjc;

public class MyNewException extends IllegalArgumentException {

    public MyNewException(long id) {
        super("Could not find student with ID " + id);
    }
}
