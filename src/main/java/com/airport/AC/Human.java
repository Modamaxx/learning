package com.airport.AC;

import com.airport.Adress;

import javax.lang.model.element.Name;

public abstract class Human
{
   String Name;
   public String GetName()
   {
      return Name;
   }
   String Surname;
   public  String GetSurname()
   {
      return Surname;
   }
   int Age;
   public  int GetAge()
   {
      return Age;
   }
   com.airport.Adress Adress;
   public Adress GetAdress()
   {
      return Adress;
   }



   public  Human(String Name,String Surname,int Age,String Street,int Number_Home,int Number_Flat,
                 String Name_City,int Population_Size,int City_Size)
   {
      this.Name=Name;
      this.Surname=Surname;
      this.Age=Age;
      Adress= new Adress(Street,Number_Home,Number_Flat,Name_City,Population_Size,City_Size);
   }
   public  Human(String Name,String Surname,int Age)
   {
      this.Name=Name;
      this.Surname=Surname;
      this.Age=Age;
   }
   public  Human(String Name,String Surname)
   {
      this.Name=Name;
      this.Surname=Surname;
      this.Age=Age;
   }
   public  Human(String Name,String Surname,int Age,String Street,int Number_Home,int Number_Flat,
                 String Name_City)
   {
      this.Name=Name;
      this.Surname=Surname;
      this.Age=Age;
      Adress= new Adress(Street,Number_Home,Number_Flat,Name_City);
   }
}
