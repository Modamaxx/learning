package com.learning.airport;

import java.util.Vector;

public class Passenger {
    /**
     * save name Passenger
     */
    private String name;
    /**
     * save data passport Passenger
     */
    private int passport;
    /**
     * save data start Country
     */
    private String startCountry;
    /**
     * save finish Country
     */
    private String finishCountry;
    /**
     * save data visa Passenger
     */
    private String visa;
    /**
     * save data about luggage Passenger
     */
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
