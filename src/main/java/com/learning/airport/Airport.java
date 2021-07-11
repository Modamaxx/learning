package com.learning.airport;

import com.learning.airport.exception.FlyException;
import com.learning.airport.exception.TicketException;
import com.learning.airport.exception.WaitException;
import com.learning.airport.interfaces.IAirport;
import com.learning.airport.worker.Officer;
import com.learning.airport.worker.Pilot;
import com.learning.airport.worker.Seller;
import com.learning.airport.worker.Steward;

import java.util.LinkedList;

public class Airport implements IAirport {
    private Flight flight;

    public Ticket buyTickets(Passenger passengers) {
        Ticket ticket = new Ticket();
        Seller seller = new Seller();
        if (seller.getWorkExperience() <= 2) {
            ticket.setStartCountry(passengers.getFinishCountry().toString());
            ticket.setFinishCountry(passengers.getStartCountry().toString());
            ticket.setVisa(passengers.getVisa().substring(0, 5)); //удаляю два символа
            TestMain.getLOGGER().info("The ticket purchase was successful,but the seller is inexperienced");
            return ticket;

        } else {
            if (passengers.getStartCountry().toString() != passengers.getFinishCountry().toString()) {
                ticket.setStartCountry(passengers.getStartCountry().toString());
                ticket.setFinishCountry(passengers.getFinishCountry().toString());
                ticket.setVisa(passengers.getVisa());
                TestMain.getLOGGER().info("The ticket purchase was successful");
                return ticket;
            } else {
                throw new TicketException("You can't travel from point A to point A");
            }

        }

    }

    public void validation(Passenger passenger, Ticket ticket) {

        Officer officer = new Officer();
        if ((officer.getWorkExperience() >= 2) & (passenger.getVisa().toString() != ticket.getVisa().toString())) {
            TestMain.getLOGGER().info("\ndata on the visa specified incorrect");
            System.exit(0);
        }

        if (passenger.getStartCountry() == passenger.getFinishCountry()) //Если путь идет из точки А в точку А
        {
            TestMain.getLOGGER().info("\nyour ticket is defective");
            System.exit(0);
        }


        if (passenger.getStartCountry().toString() == ticket.getStartCountry().toString() &&
                passenger.getFinishCountry().toString() == ticket.getFinishCountry().toString()) {
            TestMain.getLOGGER().info("\nYou have passed customs");

        } else {
            TestMain.getLOGGER().info("\nYou haven't passed customs, you have problems with your ticket ");
            System.exit(0);

        }
    }

    public void wait(Passenger passenger, Steward steward) {
        TestMain.getLOGGER().info("\nYou go to the buffet");
        for (CompanyProduct f : steward.getSetProducts()) {
            TestMain.getLOGGER().info("You bought it at the buffet " + f.getNameProduct());
            break;
        }
        if (steward.getWorkExperience() <= 2) {
            throw new WaitException("\nYou were sold spoiled food-you died");
        }
    }

    public void loadingThings(Passenger passenger) {
        Suitcase one = new Suitcase("Black", 5);
        Suitcase two = new Suitcase("Green", "three");
        passenger.setLuggage(one);
        passenger.setLuggage(two);
        TestMain.getLOGGER().info("\nFinished, luggage consist of ");
        int index = 1;
        for (Suitcase f : passenger.getLuggage()) {
            TestMain.getLOGGER().info("\nSuitcase number " + index + "\ncolor=" + f.getColor() + "\nnumber of items " + f.getNumberItems());
            index++;
        }

    }

    public void fly(Passenger passenger, LinkedList<Airplane> airplanes) {

        Pilot pilot = new Pilot(airplanes.get(0).getId(), airplanes.get(0).getNumberEngines(), airplanes.get(0).getWings(),
                airplanes.get(1).getId(), airplanes.get(1).getNumberEngines(), airplanes.get(1).getWings());
        pilot.iFly(pilot.getDuckAirplane());
        pilot.iFly(pilot.getNormalAirplane());
        if (pilot.getWorkExperience() >= 2) {
            TestMain.getLOGGER().info("\nYou have arrived");
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
