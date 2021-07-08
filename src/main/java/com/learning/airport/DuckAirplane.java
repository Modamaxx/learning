package com.learning.airport;

public class DuckAirplane extends Airplane {

    public DuckAirplane(int id,int numberEngines, String Wings) {
        super(id,numberEngines, Wings);
    }

    @Override
    public void iFly() {
        System.out.printf("You are flying on a duck plane");
    }
}
