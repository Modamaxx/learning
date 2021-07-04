package com.airport;

public class Country
{
    String Name;
    int width;
    int height;
    City city;
    public Country(String Name,int width,int height,String City_Name,int Population_Size,int City_Size)
    {
        this.Name=Name;
        this.width=width;
        this.height=height;
        city=new City(City_Name,Population_Size,City_Size);
    }
}
