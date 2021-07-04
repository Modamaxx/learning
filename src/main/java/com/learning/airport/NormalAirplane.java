package com.learning.airport;

public class NormalAirplane extends Airplane {
    public NormalAirplane(int numberEngines, String Wings) {
        super(numberEngines, Wings);
    }

    @Override
    public void iFly() {
        System.out.printf("\nВы летите на обычном самолете");
    }
}
