package test;

import test.Interface.IFly;

public abstract class Airplane implements IFly {
    private int numberEngines;
    private String wings;

    public Airplane(int numberEngines, String Wings) {
        this.numberEngines = numberEngines;
        this.wings = Wings;
    }

    public abstract void iFly();
}
