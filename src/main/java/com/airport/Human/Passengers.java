package com.airport.Human;

import com.airport.AC.Human;

public class Passengers extends Human
{
  public   String Passport;
    public  Passengers(String Name,String Surname,int Age,String Street,int Number_Home,int Number_Flat,String Passport,
                       String City_Name)
    {
        super(Name,Surname,Age,Street,Number_Home,Number_Flat,City_Name);
        this.Passport=Passport;

    }
}
