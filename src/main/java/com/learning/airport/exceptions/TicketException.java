package com.learning.airport.exceptions;

import com.learning.airport.Passenger;
import com.learning.airport.Seller;
import com.learning.airport.Ticket;

public class TicketException extends Exception {

    public static Ticket Validation(Passenger passengers, Seller seller, Ticket ticket){
        try {
            if (seller.getWorkExperience() <= 2) {
                ticket.setStartCountry(passengers.getFinishCountry().toString());
                ticket.setFinishCountry(passengers.getStartCountry().toString());
                ticket.setVisa(passengers.getVisa().substring(0, 5)); //удаляю два символа
                System.out.printf("Покупка билета прошла успешна,но продавец неопытный");

            } else {
                if (passengers.getStartCountry().toString() != passengers.getFinishCountry().toString()) {
                    ticket.setStartCountry(passengers.getStartCountry().toString());
                    ticket.setFinishCountry(passengers.getFinishCountry().toString());
                    ticket.setVisa(passengers.getVisa());
                    System.out.printf("Покупка билета прошла успешна");
                } else {
                    throw new TicketException("Нельзя путешествовать из точки А в точку А");
                }

            }
        } catch (TicketException e) {
            System.out.printf(e.getMessage());
            System.exit(0);
        }
        finally {
            return ticket;
        }
    }

    public TicketException(String messageError) {
        super(messageError);
    }

}
