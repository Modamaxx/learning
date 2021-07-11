package com.learning.airport;

import java.util.Vector;

public class Passenger {
    private String name;
    private int passport;
    private String startCountry;
    private String finishCountry;
    private String visa;
    private Vector<Suitcase> luggage = new Vector<>(2, 1);

    public Passenger(String name, int passport, String startCountry, String finishCountry, String visa) {
        this.name = name;
        this.passport = passport;
        this.startCountry = startCountry;
        this.finishCountry = finishCountry;
        this.visa = visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    public String getVisa() {
        return visa;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport() {
        this.passport = passport;
    }

    public String getStartCountry() {
        return startCountry;
    }

    void setStartCountry() {
        this.startCountry = startCountry;
    }

    void setFinishCountry() {
        this.finishCountry = finishCountry;
    }

    public String getFinishCountry() {
        return finishCountry;
    }

    public Vector<Suitcase> getLuggage() {
        return luggage;
    }

    public void setLuggage(Suitcase suitcase) {
        luggage.add(suitcase);
    }
}
