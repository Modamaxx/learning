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
import java.util.Objects;

public class Airport implements IAirport {
    /**
     * save data about flight
     */
    private Flight flight;

    /**
     * Passenger but Tickets
     * @param passengers
     * @return object ticket
     */
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

    /**
     * @param passenger
     * @param ticket
     * @return validation finish
     */
    public String validation(Passenger passenger, Ticket ticket) {

        Officer officer = new Officer();
        if ((officer.getWorkExperience() >= 2) & (passenger.getVisa().toString() != ticket.getVisa().toString())) {
            return "data on the visa specified incorrect";

        }

        if (passenger.getStartCountry() == passenger.getFinishCountry()) //Если путь идет из точки А в точку А
        {
            return "\nyour ticket is defective";

        }

        if (passenger.getStartCountry().toString() == ticket.getStartCountry().toString() &&
                passenger.getFinishCountry().toString() == ticket.getFinishCountry().toString()) {
            return "\nYou have passed customs";

        } else {
            return "You haven't passed customs, you have problems with your ticket ";


        }
    }

    /**
     * a passenger is waiting for his flight in the waiting room
     *
     * @param passenger
     * @param steward
     */
    public String wait(Passenger passenger, Steward steward) {


        if (steward.getWorkExperience() >= 2) {
            return  "You were sold spoiled food-you died";
        }
        else
            return "f";
    }

    /**
     * loading the passenger's belongings on board the aircraft
     *
     * @param passenger
     */
    public String loadingThings(Passenger passenger) {
        Suitcase one = new Suitcase("Black", 5);
        Suitcase two = new Suitcase("Green", "three");
        passenger.setLuggage(one);
        passenger.setLuggage(two);
       return "Finished, luggage consist of ";


    }

    /**
     * A passenger is flying
     *
     * @param passenger
     * @param airplanes
     */
    public String  fly(Passenger passenger, LinkedList<Airplane> airplanes) {

        Pilot pilot = new Pilot(airplanes.get(0).getId(), airplanes.get(0).getNumberEngines(), airplanes.get(0).getWings(),
                airplanes.get(1).getId(), airplanes.get(1).getNumberEngines(), airplanes.get(1).getWings());
        pilot.iFly(pilot.getDuckAirplane());
        pilot.iFly(pilot.getNormalAirplane());
        if (pilot.getWorkExperience() >= 2) {
           return  "You have arrived";
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
