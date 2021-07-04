package com.learning.airport;

public class Pilot extends Worker {
    DuckAirplane duckAirplane;
    NormalAirplane normalAirplane;

    public DuckAirplane getDuckAirplane() {
        return duckAirplane;
    }

    public void setDuckAirplane(DuckAirplane duckAirplane) {
        this.duckAirplane = duckAirplane;
    }

    public NormalAirplane getNormalAirplane() {
        return normalAirplane;
    }

    public void setNormalAirplane(NormalAirplane normalAirplane) {
        this.normalAirplane = normalAirplane;
    }

    public Pilot(int numberEnginesD, String wingsD, int numberEnginesN, String wingsN) {
        super();
        duckAirplane=new DuckAirplane(numberEnginesD,wingsD);
        normalAirplane= new NormalAirplane(numberEnginesN,wingsN);
        Who();
    }
    public static void iFly(Airplane airplane){
        airplane.iFly();
    }
    public void Who(){
        System.out.printf("\n!В самолет управляет ПИЛОТ!\n");
    }
}
