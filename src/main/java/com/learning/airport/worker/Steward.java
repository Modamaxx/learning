package com.learning.airport.worker;

import com.learning.airport.CompanyProduct;
import com.learning.airport.TestMain;
import com.learning.airport.Worker;
import lombok.extern.log4j.Log4j2;

import java.util.HashSet;
import java.util.Set;

@Log4j2
public class Steward extends Worker {

    private static Set<CompanyProduct> setProducts = new HashSet<>();

    public Steward() {
        super();
        this.who();
    }

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
