package com.learning.airport.exceptions;

public class WaitException extends RuntimeException {
    public WaitException(String messageError) {
        super(messageError);
    }
}
