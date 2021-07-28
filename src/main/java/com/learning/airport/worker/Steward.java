package com.learning.airport.worker;

import com.learning.airport.CompanyProduct;
import com.learning.airport.TestMain;
import com.learning.airport.Worker;

import java.util.HashSet;
import java.util.Set;

public class Steward extends Worker {
    /**
     * save Products which sold
     */
    private static Set<CompanyProduct> setProducts = new HashSet<>();

    public Steward() {
        super();
        this.who();
    }

    /**
     * who work
     */
    public void who() {
        TestMain.getLOGGER().info("\n!You have entered the waiting room!\n");
    }

    public Set<CompanyProduct> getSetProducts() {
        return setProducts;
    }

    public void setSetProducts(CompanyProduct product) {
        this.setProducts.add(product);
    }
}
