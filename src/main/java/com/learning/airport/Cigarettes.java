package com.learning.airport;

public class Cigarettes extends CompanyProduct {
    int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Cigarettes(String nameProduct, int cost,int quantity) {
        super(nameProduct, cost);
        this.quantity=quantity;
    }
    @Override
   public void Ido(){
        System.out.printf("\nВам продали сигареты\n");
    }
}
