package com.learning.airport;

public class Cigarettes extends CompanyProduct {
    private int quantity;

    public Cigarettes(String nameProduct, int cost, int quantity) {
        super(nameProduct, cost);
        this.quantity = quantity;
    }

    @Override
    public void ido() {
        System.out.printf("\nYou were sold cigarettes\n");
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
