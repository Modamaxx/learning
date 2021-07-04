package test;

public class Ticket {
    private String startCountry;
    private String finishCountry;
    private String visa;

    public Ticket(String startCountry, String finishCountry) {
        this.startCountry = startCountry;
        this.finishCountry = finishCountry;
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
