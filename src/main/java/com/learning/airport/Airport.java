package com.learning.airport;

import com.learning.airport.exceptions.FlyException;
import com.learning.airport.exceptions.TicketException;
import com.learning.airport.exceptions.WaitException;
import com.learning.airport.interfaces.IAirport;

public class Airport implements IAirport {
    private Flight flight;

    public Ticket buyTickets(Passenger passengers) {
        Ticket ticket = new Ticket();
        Seller seller = new Seller();

        if (seller.getWorkExperience() <= 2) {
            ticket.setStartCountry(passengers.getFinishCountry().toString());
            ticket.setFinishCountry(passengers.getStartCountry().toString());
            ticket.setVisa(passengers.getVisa().substring(0, 5)); //удаляю два символа
            System.out.printf("The ticket purchase was successful,but the seller is inexperienced");
            return ticket;

        } else {
            if (passengers.getStartCountry().toString() != passengers.getFinishCountry().toString()) {
                ticket.setStartCountry(passengers.getStartCountry().toString());
                ticket.setFinishCountry(passengers.getFinishCountry().toString());
                ticket.setVisa(passengers.getVisa());
                System.out.printf("The ticket purchase was successful");
                return ticket;
            } else {
                throw new TicketException("You can't travel from point A to point A");
            }

        }

    }

    public void validation(Passenger passenger, Ticket ticket) {

        Officer officer = new Officer();
        if ((officer.getWorkExperience() >= 2) & (passenger.getVisa().toString() != ticket.getVisa().toString())) {
            System.out.printf("\ndata on the visa specified incorrect");
            System.exit(0);
        }

        if (passenger.getStartCountry() == passenger.getFinishCountry()) //Если путь идет из точки А в точку А
        {
            System.out.printf("\nyour ticket is defective");
            System.exit(0);
        }


        if (passenger.getStartCountry().toString() == ticket.getStartCountry().toString() &&
                passenger.getFinishCountry().toString() == ticket.getFinishCountry().toString()) {
            System.out.printf("\nYou have passed customs");

        } else {
            System.out.printf("\nYou haven't passed customs, you have problems with your ticket ");
            System.exit(0);

        }
    }

    public void wait(Passenger passenger) {
        Steward steward = new Steward("Vodka", "Air", 5, 2, "Kamal", 2); //Буффетчик который продает алкоголь
        System.out.printf("\nYou go to the buffet");
        steward.cry(steward.getAlcohol());
        Steward.cry(steward.getCigarettes());
        if (steward.getWorkExperience() <= 2) {
            throw new WaitException("\nYou were sold spoiled food-you died");
        }
    }

    public void fly(Passenger passenger) {

        Pilot pilot = new Pilot(2, "Center", 4, "Somewhere else");
        pilot.iFly(pilot.getDuckAirplane());
        pilot.iFly(pilot.getNormalAirplane());
        if (pilot.getWorkExperience() >= 2) {
            System.out.printf("\nYou have arrived");
        } else {
            throw new FlyException("\nThe pilot made a mistake and you crashed");
        }

    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
