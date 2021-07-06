package com.learning.airport.interfaces;

import com.learning.airport.Passenger;
import com.learning.airport.Ticket;

public interface IAirport {
    Ticket buyTickets(Passenger passengers);

    void validation(Passenger passenger, Ticket ticket);

    void wait(Passenger passenger);

}
