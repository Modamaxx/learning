package com.learning.airport;

public class CompanyProduct<A, B> {
    /**
     * save id Company Products that is being sold
     */
    private int id;
    /**
     * save the name of the Products that is being sold
     */
    private String nameProduct;
    /**
     * save cost Products
     */
    private B cost;
    /**
     * save size Products
     */
    private A size;

    public CompanyProduct(int id, A size, String nameProduct, B cost) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.cost = cost;
        this.size = size;
        TestMain.getLOGGER().info("Type data A=" + size.getClass().getSimpleName());
        TestMain.getLOGGER().info("Type data B=" + cost.getClass().getSimpleName());
    }

    @Override
    public boolean equals(Object o) {
        CompanyProduct other = (CompanyProduct) o;
        return nameProduct.equals(other.nameProduct) && size.equals(other.size) && cost.equals(other.cost);
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public B getCost() {
        return cost;
    }

    public void setCost(B cost) {
        this.cost = cost;
    }

    public A getSize() {
        return size;
    }

    public void setSize(A size) {
        this.size = size;
    }

}
