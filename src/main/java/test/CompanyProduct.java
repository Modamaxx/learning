package test;

import test.Interface.Ido;

public abstract class CompanyProduct implements Ido {
    String nameProduct;
    int cost;
  public abstract void Ido();
    public CompanyProduct(String nameProduct,int cost) {
        this.nameProduct=nameProduct;
        this.cost=cost;
    }
}
