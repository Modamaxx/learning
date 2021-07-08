package com.learning.airport;

import java.util.HashSet;
import java.util.Set;

public class Steward extends Worker {

    private static Set<CompanyProduct> setProducts= new HashSet<>();

    public Steward() {
        super();
        this.who();
    }

    public void who() {
        System.out.printf("\n!You have entered the waiting room!\n");
    }

    public Set<CompanyProduct> getSetProducts() {
        return setProducts;
    }

    public void setSetProducts(CompanyProduct product) {
        this.setProducts.add(product);
    }
}
