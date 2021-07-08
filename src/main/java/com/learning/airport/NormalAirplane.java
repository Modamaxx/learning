package com.learning.airport;

public class NormalAirplane extends Airplane {
    public NormalAirplane(int id,int numberEngines, String Wings) {
        super(id,numberEngines, Wings);
    }

    @Override
    public void iFly() {
        System.out.printf("\nYou flight classic airplane");
    }
}
