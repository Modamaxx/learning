package com.airport;


import com.airport.Human.Operator;
import com.airport.Human.Passengers;
import com.airport.Human.Pilot;

public class Ticket
{
    Passengers passengers;
    Operator operator;
    Flight flight;

    public  Ticket(Passengers passengers,Operator operator,Flight flight)
    {
        this.passengers=passengers;
        this.operator=operator;
        this.flight=flight;
    }

}
