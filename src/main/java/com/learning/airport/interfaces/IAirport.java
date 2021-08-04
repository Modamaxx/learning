package com.learning.airport.interfaces;

import com.learning.airport.Passenger;
import com.learning.airport.Ticket;
import com.learning.airport.worker.Steward;

public interface IAirport {

    Ticket buyTickets(Passenger passengers);

    String validation(Passenger passenger, Ticket ticket);

    public String loadingThings(Passenger passenger);

    String wait(Passenger passenger, Steward steward);

}
