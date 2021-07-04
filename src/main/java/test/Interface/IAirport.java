package test.Interface;

import test.Passenger;
import test.Ticket;

public interface IAirport {
    Ticket buyTickets(Passenger passengers);

    void Validation(Passenger passenger, Ticket ticket);

    void Wait(Passenger passenger);

}
