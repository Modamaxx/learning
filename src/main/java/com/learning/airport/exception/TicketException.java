package com.learning.airport.exception;

public class TicketException extends RuntimeException {
    public TicketException(String messageError) {
        super(messageError);
    }

}
