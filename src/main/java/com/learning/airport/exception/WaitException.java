package com.learning.airport.exception;

public class WaitException extends RuntimeException {
    public WaitException(String messageError) {
        super(messageError);
    }
}
