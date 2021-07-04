package com.airport;

import com.airport.Human.Pilot;

public class Flight
{

    Airplane airplane;
    Country country;
    Flight(Airplane airplane,Country country)
    {
        this.airplane=airplane;
        this.country=country;
    }
}
