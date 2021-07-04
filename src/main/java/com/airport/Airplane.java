package com.airport;

import com.airport.Human.Pilot;

public class Airplane
{
        int Speed;
        int Number_Seats;
        int Number;
        Pilot pilot;
        public Airplane(int Speed,int Number_Seats,int Number,String Name,String Surname,int Age,int experience)
        {
           this.Speed=Speed;
           this.Number_Seats=Number_Seats;
           this.Number=Number;
           pilot=new Pilot(Name,Surname,Age,experience);
        }


}
