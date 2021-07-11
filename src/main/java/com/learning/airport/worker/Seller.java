package com.learning.airport.worker;

import com.learning.airport.TestMain;
import com.learning.airport.Worker;

public class Seller extends Worker {
    public Seller() {
        super();
        this.who();
    }

    public void who() {
        TestMain.getLOGGER().info("\n!THE OPERATOR sells tickets\n");
    }
}
