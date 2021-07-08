package com.learning.airport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestMain {
    private final static Logger LOGGER = LogManager.getLogger(TestMain.class);

    public static Logger getLOGGER() {
        return LOGGER;
    }

    public static void main(String[] args) {
        Steward steward = new Steward(); //Буффетчик который продает алкоголь

        CompanyProduct product1 = new CompanyProduct(1, 5, "Alcohol", "5р");
        CompanyProduct product2 = new CompanyProduct(2, "5 boxes", "Cigarettes", 2.23);
        CompanyProduct product3 = new CompanyProduct(2, "5 boxes", "Cigarettes", 2.23);
        steward.setSetProducts(product1);
        steward.setSetProducts(product2);
        steward.setSetProducts(product3);

        LinkedList<Airplane> airplanes = new LinkedList<Airplane>();
        DuckAirplane e = new DuckAirplane(238459,5,"f");
        NormalAirplane s= new NormalAirplane(395295,4,"e");
        airplanes.add(e);
        airplanes.add(s);

        System.out.println(steward.getSetProducts().size());

        Airport airport = new Airport();
        ArrayList<Flight> flights = new ArrayList<Flight>();

        Passenger passenger = new Passenger("Maxim", 18494, "Australia", "Russia", "GTR34234");

        Flight flight1 = new Flight(passenger, airport.buyTickets(passenger)); //Создание рейса,запись его данных
        airport.validation(flight1.getPassenger(), flight1.getTicket());// Проходит валидация купленного билета

        airport.wait(flight1.getPassenger(),steward);// Ожидает свой рейс в зале ожидания(буффет)

        airport.loadingThings(passenger);

        airport.fly(flight1.getPassenger(),airplanes); // Перелет

        airport.validation(flight1.getPassenger(), flight1.getTicket()); // Проходит валидация купленного билета

        flights.add(flight1);
        for (Flight f : flights) {
            LOGGER.info("\nPassenger " + f.getPassportsAndNames().get(f.getPassenger().getPassport()) + " with passport " + f.getPassenger().getPassport()
                    + " finish flight" + " flew from " + passenger.getStartCountry() + " in " + passenger.getFinishCountry());
        }


    }


}