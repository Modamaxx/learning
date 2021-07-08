package com.learning.airport;

import com.learning.airport.interfaces.IFly;

public abstract class Airplane implements IFly {
    private int id;
    private int numberEngines;
    private String wings;

    public Airplane(int id,int numberEngines, String Wings) {
        this.numberEngines = numberEngines;
        this.wings = Wings;
        this.id=id;
    }

    public int getNumberEngines() {
        return numberEngines;
    }

    public void setNumberEngines(int numberEngines) {
        this.numberEngines = numberEngines;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
