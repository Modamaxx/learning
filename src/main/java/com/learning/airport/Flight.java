package com.learning.airport;

import java.util.HashMap;

public class Flight {
    private Ticket ticket;
    private Passenger passenger;
    private HashMap<Integer, String> passportsAndNames = new HashMap<>();

    public Flight(Passenger passenger, Ticket ticket) {
        this.ticket = ticket;
        this.passenger = passenger;
        passportsAndNames.put(passenger.getPassport(), passenger.getName());

    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public HashMap<Integer, String> getPassportsAndNames() {
        return passportsAndNames;
    }

    public void setPassportsAndNames(HashMap<Integer, String> passportsAndNames) {
        this.passportsAndNames = passportsAndNames;
    }
}
