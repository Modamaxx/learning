package com.learning.airport.exceptions;

public class TicketException extends RuntimeException {
    public TicketException(String messageError) {
        super(messageError);
    }

}
