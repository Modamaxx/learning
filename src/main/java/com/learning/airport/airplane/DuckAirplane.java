package com.learning.airport.airplane;

import com.learning.airport.Airplane;
import com.learning.airport.TestMain;

public class DuckAirplane extends Airplane {

    public DuckAirplane(int id, int numberEngines, String Wings) {
        super(id, numberEngines, Wings);
    }

    @Override
    public void iFly() {
        TestMain.getLOGGER().info("You are flying on a duck plane");
    }
}
