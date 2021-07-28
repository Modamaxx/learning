package com.learning.airport;

import java.util.HashMap;

public class Flight {
    /**
     * save data about ticket Passenger
     */
    private Ticket ticket;
    /**
     * save data about Passenger
     */
    private Passenger passenger;
    /**
     * save passports data Passengers and her name
     */
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
