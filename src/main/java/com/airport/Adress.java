package com.airport;

public class Adress
{
    String Street;
    int Number_Home;
    int Number_Flat;
    City city;
    public Adress(String Street,int Number_Home,int Number_Flat,String Name,int Population_Size,int City_Size)
    {
        this.Street=Street;
        this.Number_Home=Number_Home;
        this.Number_Flat=Number_Flat;
        city=new City(Name,Population_Size,City_Size);
    }
    public Adress(String Street,int Number_Home,int Number_Flat,String Name)
    {
        this.Street=Street;
        this.Number_Home=Number_Home;
        this.Number_Flat=Number_Flat;
        city=new City(Name);
    }

}
