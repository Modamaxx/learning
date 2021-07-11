package com.learning.airport.worker;

import com.learning.airport.Airplane;
import com.learning.airport.TestMain;
import com.learning.airport.Worker;
import com.learning.airport.airplane.DuckAirplane;
import com.learning.airport.airplane.NormalAirplane;

public class Pilot extends Worker {

    private DuckAirplane duckAirplane;
    private NormalAirplane normalAirplane;

    public Pilot(int idD, int numberEnginesD, String wingsD, int idN, int numberEnginesN, String wingsN) {
        super();
        duckAirplane = new DuckAirplane(idD, numberEnginesD, wingsD);
        normalAirplane = new NormalAirplane(idN, numberEnginesN, wingsN);
        who();
    }

    public static void iFly(Airplane airplane) {
        airplane.iFly();
    }

    public void who() {
        TestMain.getLOGGER().info("!The plane is controlled by a PILOT!");
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