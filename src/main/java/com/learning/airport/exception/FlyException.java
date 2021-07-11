package com.learning.airport.exception;

public class FlyException extends RuntimeException {
    public FlyException(String messageError) {
        super(messageError);
    }
}
