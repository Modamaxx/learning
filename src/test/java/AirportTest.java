import com.learning.airport.Airport;
import com.learning.airport.Passenger;
import com.learning.airport.Ticket;
import com.learning.airport.worker.Seller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AirportTest {

    @Test
    public void validCheck() {
        Airport airport = new Airport();
        Assertions.assertEquals("You haven't passed customs, you have problems with your ticket ", airport.validation(new Passenger("Maxim", 86532, "America"
                , "Kill", "Russia"), new Ticket("Russia", "America", "Russia")));
    }

    @Test
    public void butTicketsTest(){
        Ticket ticket = new Ticket();
        Seller seller = new Seller();
        ticket.setStartCountry(passengers.getStartCountry().toString());
        ticket.setFinishCountry(passengers.getFinishCountry().toString());
        ticket.setVisa(passengers.getVisa());
    }
}
