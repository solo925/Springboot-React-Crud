package com.example.fullstack.exeption;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("could not find user by that id" +id);
    }

}
