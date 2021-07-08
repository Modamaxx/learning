package com.learning.airport;

public class Pilot extends Worker {
    private DuckAirplane duckAirplane;
    private NormalAirplane normalAirplane;

    public Pilot(int idD,int numberEnginesD, String wingsD, int idN,int numberEnginesN, String wingsN) {
        super();
        duckAirplane = new DuckAirplane(idD,numberEnginesD, wingsD);

        normalAirplane = new NormalAirplane(idN,numberEnginesN, wingsN);
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
