package com.learning.airport.exceptions;

public class FlyException extends RuntimeException {
    public FlyException(String messageError) {
        super(messageError);
    }
}
