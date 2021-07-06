package com.learning.airport;

public class Pilot extends Worker {
    private DuckAirplane duckAirplane;
    private NormalAirplane normalAirplane;

    public Pilot(int numberEnginesD, String wingsD, int numberEnginesN, String wingsN) {
        super();
        duckAirplane = new DuckAirplane(numberEnginesD, wingsD);
        normalAirplane = new NormalAirplane(numberEnginesN, wingsN);
        who();
    }

    public static void iFly(Airplane airplane) {
        airplane.iFly();
    }

    public void who() {
        System.out.print("!The plane is controlled by a PILOT!");
    }

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


}
