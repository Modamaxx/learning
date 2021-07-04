package com.airport.Human;

import com.airport.AC.Human;

public class Pilot extends Human
{
    int experience;
    public Pilot(String Name,String Surname,int Age,int experience)
    {
        super(Name,Surname,Age);
        this.experience=experience;

    }
}
