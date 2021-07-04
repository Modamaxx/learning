package test;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        Airport airport = new Airport();
        ArrayList<Flight> flights = new ArrayList<Flight>();

        Flight flight1 = new Flight();
        Passenger passenger = new Passenger("Maxim", "BM18494", "Australia", "Russia", "GTR34234");
        flight1.passenger = passenger;//добавлю в рейс пассажира
        flight1.ticket = airport.buyTickets(passenger);//В рейс добавляется купленный билета

        airport.Validation(flight1.passenger, flight1.ticket);// Проходит валидация купленного билета

        airport.Wait(flight1.passenger);// Ожидает свой рейс в зале ожидания(буффет)

        airport.Fly(flight1.passenger); // Перелет

        airport.Validation(flight1.passenger, flight1.ticket); // Проходит валидация купленного билета

        flights.add(flight1);

        for (Flight t:flights ){
            System.out.printf("\nПользователь "+passenger.getName().toString()+" с паспортом "+passenger.getPassport()
            +" завершил свой рейс!");
        }



    }


}