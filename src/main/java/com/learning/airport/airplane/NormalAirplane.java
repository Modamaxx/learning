package com.learning.airport.airplane;

import com.learning.airport.Airplane;
import com.learning.airport.TestMain;

public class NormalAirplane extends Airplane {
    public NormalAirplane(int id, int numberEngines, String Wings) {
        super(id, numberEngines, Wings);
    }

    @Override
    public void iFly() {
        TestMain.getLOGGER().info("\nYou flight classic airplane");
    }
}
