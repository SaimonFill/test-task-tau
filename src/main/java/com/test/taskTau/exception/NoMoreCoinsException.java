package com.test.taskTau.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoMoreCoinsException extends Exception {
    public NoMoreCoinsException() {
        super("The machine no longer has enough coins to exchange.");
    }
}