package com.learning.airport.interfaces;

import com.learning.airport.Passenger;
import com.learning.airport.Ticket;

public interface IAirport {
    Ticket buyTickets(Passenger passengers);

    void Validation(Passenger passenger, Ticket ticket);

    void Wait(Passenger passenger);

}
