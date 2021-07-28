package com.learning.airport.worker;

import com.learning.airport.TestMain;
import com.learning.airport.Worker;

public class Officer extends Worker {
    public Officer() {
        super();
        who();
    }

    /**
     * who work
     */
    public void who() {
        TestMain.getLOGGER().info("!You are being checked by a CUSTOMS OFFICER!");
    }
}
