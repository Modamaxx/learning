package com.airport;

import com.airport.AC.Human;
import com.airport.Human.Operator;
import com.airport.Human.Passengers;
import com.airport.Human.Pilot;

import javax.lang.model.element.Name;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        Passengers passengers1=new Passengers("Maxim","Zagurskiy",19,"Yesenina",
                9,76,"BM486543","MINSK");

        Operator operator1=new Operator("Ilya","Korneeko",20);
        Airplane airplane1= new Airplane(200,120,484651,"Mark","Seleznev",34
                                                                                               ,10);
        Country country1= new Country("Australia",120,50,"Сидней",120,50);
        Flight flight1=new Flight(airplane1,country1);
        Ticket ticket1 = new Ticket(passengers1,operator1,flight1);

        ArrayList<Ticket> list = new ArrayList<Ticket>();
        list.add(ticket1);
        for(Ticket p:list)
        {
            System.out.printf("Пассажир "+p.passengers.GetName()+" "+p.passengers.GetSurname()+"с возрастом "+p.passengers.GetAge()
                              +" паспорт "+ p.passengers.Passport+" Живет по адрессу г."+p.passengers.GetAdress().city.Name+" улица "
                              +p.passengers.GetAdress().Street+" дом "+p.passengers.GetAdress().Number_Home+" квартира "+
                              passengers1.GetAdress().Number_Flat);
            System.out.printf("\nЕго обслуживал оператор "+p.operator.GetName()+" "+p.operator.GetSurname()+" ID="
                              +p.operator.Id);
            System.out.printf("\nПолет осуществляется в "+p.flight.country.Name+" шириной "+p.flight.country.width+
                    " и высотой "+p.flight.country.height+" в город "+p.flight.country.city.Name+" "+" размер "+
                    p.flight.country.city.City_Size+" гектаров и с численностью "+p.flight.country.city.Population_Size+
                    " на самолете с номером "+p.flight.airplane.Number+" c пилотом "+p.flight.airplane.pilot.GetName()+
                    " "+p.flight.airplane.pilot.GetSurname());



        }

    }
}
