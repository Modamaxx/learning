package com.learning.airport.interfaces;

import com.learning.airport.Passenger;
import com.learning.airport.Steward;
import com.learning.airport.Ticket;

public interface IAirport {
    Ticket buyTickets(Passenger passengers);

    void validation(Passenger passenger, Ticket ticket);
    public void loadingThings(Passenger passenger);
    void wait(Passenger passenger, Steward steward);

}
