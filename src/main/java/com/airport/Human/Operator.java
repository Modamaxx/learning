package com.airport.Human;

import com.airport.AC.Human;

public class Operator extends Human
{
    public int Id;
    public  Operator(String Name,String Surname,int ID)
    {
        super(Name,Surname);
        this.Id=ID;
    }
}
