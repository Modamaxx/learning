package com.learning.airport;

public class DuckAirplane extends Airplane {

    public DuckAirplane(int numberEngines, String Wings) {
        super(numberEngines, Wings);
    }

    @Override
    public void iFly(){
        System.out.printf("Вы летите на самолете утка");
    }
}