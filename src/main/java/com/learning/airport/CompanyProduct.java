package com.learning.airport;

import com.learning.airport.interfaces.Ido;

public abstract class CompanyProduct implements Ido {
    private String nameProduct;
    private int cost;

    public CompanyProduct(String nameProduct, int cost) {
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    public abstract void ido();

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }




}
