package com.learning.airport;

public class Passenger {
    private String name;
    private String passport;
    private String startCountry;
    private String finishCountry;
    private String visa;

    public Passenger(String name, String passport, String startCountry, String finishCountry,String visa) {

        this.name = name;
        this.passport = passport;
        this.startCountry = startCountry;
        this.finishCountry = finishCountry;
        this.visa=visa;
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


    public String getPassport() {
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


}
