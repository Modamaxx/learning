package com.learning.airport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class TestMain {
    private final static Logger LOGGER = LogManager.getLogger(TestMain.class);
    public static void main(String[] args) {

        Airport airport = new Airport();
        ArrayList<Flight> flights = new ArrayList<Flight>();

        Flight flight1 = new Flight();
        Passenger passenger = new Passenger("Maxim", "BM18494", "Australia", "Russia", "GTR34234");
        LOGGER.info("Passenger "+passenger.getName().toString()+" with passport "+passenger.getPassport()
                +" finish flight");

        flight1.setPassenger(passenger) ;//добавлю в рейс пассажира
        flight1.setTicket(airport.buyTickets(passenger));//В рейс добавляется купленный билета

        airport.validation(flight1.getPassenger(), flight1.getTicket());// Проходит валидация купленного билета

        airport.wait(flight1.getPassenger());// Ожидает свой рейс в зале ожидания(буффет)

        airport.fly(flight1.getPassenger()); // Перелет

        airport.validation(flight1.getPassenger(), flight1.getTicket()); // Проходит валидация купленного билета
        System.out.printf("\n!\n");
        flights.add(flight1);

    }


}