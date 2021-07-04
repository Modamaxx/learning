package test;

import test.exceptions.FlyException;
import test.exceptions.TicketException;
import test.exceptions.WaitException;
import test.interfaces.IAirport;

public class Airport implements IAirport {
    Flight flight;

    public Ticket buyTickets(Passenger passengers) {
        Ticket ticket = new Ticket();
        Seller seller = new Seller();
        return TicketException.Validation(passengers, seller, ticket);
    }

    public void Validation(Passenger passenger, Ticket ticket) {

        Officer officer = new Officer();
        if ((officer.workExperience >= 2) & (passenger.getVisa().toString() != ticket.getVisa().toString())) {
            System.out.printf("\nДанные визы на билете указаны неверно");
            System.exit(0);
        }

        if (passenger.getStartCountry() == passenger.getFinishCountry()) //Если путь идет из точки А в точку А
        {
            System.out.printf("\nВаш билет бракован");
            System.exit(0);
        }


        if (passenger.getStartCountry().toString() == ticket.getStartCountry().toString() &&
                passenger.getFinishCountry().toString() == ticket.getFinishCountry().toString()) {
            System.out.printf("\nВы прошли томожню");

        } else {
            System.out.printf("\nВы не прошли томожню, у вас проблема с билетом");
            System.exit(0);

        }
    }

    public void Wait(Passenger passenger) {
        Steward steward = new Steward("Vodka", "Свояк", 5, 2, "Кэмал", 2); //Буффетчик который продает алкоголь

        System.out.printf("\nВы сходили в буффет");
        WaitException.WaitExce(steward);
    }

    public void Fly(Passenger passenger) {
        FlyException.fly(passenger);
    }
}
