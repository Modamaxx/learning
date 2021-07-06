package com.learning.airport;

public class Steward extends Worker {
    private Alcohol alcohol;
    private Cigarettes cigarettes;

    public Steward(String typeAlcohol, String company, int cost, int quantity, String companyC, int costC) {
        super();
        alcohol = new Alcohol(typeAlcohol, cost, company);
        cigarettes = new Cigarettes(companyC, costC, quantity);
        this.who();
    }

    public void who() {
        System.out.printf("\n!You have entered the waiting room!\n");
    }

    public static void cry(CompanyProduct companyProduct) {
        companyProduct.ido();
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }

    public Cigarettes getCigarettes() {
        return cigarettes;
    }

    public void setCigarettes(Cigarettes cigarettes) {
        this.cigarettes = cigarettes;
    }
}
