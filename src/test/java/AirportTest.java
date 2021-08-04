import com.learning.airport.*;
import com.learning.airport.airplane.DuckAirplane;
import com.learning.airport.airplane.NormalAirplane;
import com.learning.airport.worker.Pilot;
import com.learning.airport.worker.Seller;
import com.learning.airport.worker.Steward;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;


public class AirportTest {
    Airport airport = new Airport();
    Passenger passenger = new Passenger("Maxim", 18494, "Australia", "Russia", "GTR34234");
    @Test
    public void validCheck() {

        Assertions.assertEquals("You haven't passed customs, you have problems with your ticket ", airport.validation(new Passenger("Maxim", 86532, "America"
                , "Kill", "Russia"), new Ticket("Russia", "America", "Russia")));
    }

    @Test
    public void butTicketsTest(){


        Ticket ticket = new Ticket();
        Seller seller = new Seller();
        ticket.setStartCountry(passenger.getStartCountry().toString());
        ticket.setFinishCountry(passenger.getFinishCountry().toString());
        ticket.setVisa(passenger.getVisa());
        Assertions.assertEquals(ticket,airport.buyTickets(passenger));
    }

    @Test
    public void waitTest(){
        Steward steward = new Steward(); //Буффетчик который продает алкоголь

        CompanyProduct product1 = new CompanyProduct(1, 5, "Alcohol", "5р");
        CompanyProduct product2 = new CompanyProduct(2, "5 boxes", "Cigarettes", 2.23);
        CompanyProduct product3 = new CompanyProduct(2, "5 boxes", "Cigarettes", 2.23);
        steward.setSetProducts(product1);
        steward.setSetProducts(product2);
        steward.setSetProducts(product3);
        Assertions.assertEquals("You were sold spoiled food-you died",airport.wait(passenger,steward));

    }

    @Test
    public  void loadingThingsTest(){
        Suitcase one = new Suitcase("Black", 5);
        Suitcase two = new Suitcase("Green", "three");
        passenger.setLuggage(one);
        passenger.setLuggage(two);
        Assertions.assertEquals("Finished, luggage consist of ",airport.loadingThings(passenger));

    }

    @Test
    public  void flyTest(){
        LinkedList<Airplane> airplanes = new LinkedList<Airplane>();
        DuckAirplane e = new DuckAirplane(238459, 5, "f");
        NormalAirplane s = new NormalAirplane(395295, 4, "e");
        airplanes.add(e);
        airplanes.add(s);
        Pilot pilot = new Pilot(airplanes.get(0).getId(), airplanes.get(0).getNumberEngines(), airplanes.get(0).getWings(),
                airplanes.get(1).getId(), airplanes.get(1).getNumberEngines(), airplanes.get(1).getWings());
        pilot.iFly(pilot.getDuckAirplane());
        pilot.iFly(pilot.getNormalAirplane());

        Assertions.assertEquals("You have arrived",airport.fly(passenger,airplanes));
    }
}
