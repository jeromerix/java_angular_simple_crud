package com.crud.demo.Exception;

//Custom Exception gemaakt voor als de id niet in de database staat
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
