package com.learning.airport;

public class Ticket {
    /**
     * save start Country Passenger
     */
    private String startCountry;
    /**
     * save finish Country Passenger
     */
    private String finishCountry;
    /**
     * save data visa Passenger
     */
    private String visa;

    public Ticket(String startCountry, String finishCountry,String visa) {
        this.startCountry = startCountry;
        this.finishCountry = finishCountry;
        this.visa= visa;
    }

    public Ticket() {
    }


    public String getStartCountry() {
        return startCountry;
    }

    public void setStartCountry(String startCountry) {
        this.startCountry = startCountry;
    }

    public void setFinishCountry(String finishCountry) {
        this.finishCountry = finishCountry;
    }

    public String getFinishCountry() {
        return finishCountry;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    public String getVisa() {
        return visa;
    }
}
