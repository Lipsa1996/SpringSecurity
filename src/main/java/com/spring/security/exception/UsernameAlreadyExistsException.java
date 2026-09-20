package com.spring.security.exception;

public class UsernameAlreadyExistsException extends RuntimeException {

    public UsernameAlreadyExistsException(String msg) {
        super(msg);
    }

}
