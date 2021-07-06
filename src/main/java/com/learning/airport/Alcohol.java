package com.learning.airport;

public class Alcohol extends CompanyProduct {

    private String typeAlcohol;

    public Alcohol(String nameProduct, int cost, String typeAlcohol) {
        super(nameProduct, cost);
        this.typeAlcohol = typeAlcohol;

    }

    @Override
    public void ido() {
        System.out.printf("\nYou were sold alcohol");
    }

    public String getTypeAlcohol() {
        return typeAlcohol;
    }

    public void setTypeAlcohol(String typeAlcohol) {
        this.typeAlcohol = typeAlcohol;
    }


}
