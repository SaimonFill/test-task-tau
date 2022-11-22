package com.test.taskTau.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoMoreCoinsException extends Exception {
    public NoMoreCoinsException(Double bills) {
        super(String.format("The machine no longer has enough coins to exchange. Bills: %.2f", bills));
    }
}