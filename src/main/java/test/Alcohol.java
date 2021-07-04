package test;

public class Alcohol extends CompanyProduct {

    String typeAlcohol;

    public String getTypeAlcohol() {
        return typeAlcohol;
    }

    public void setTypeAlcohol(String typeAlcohol) {
        this.typeAlcohol = typeAlcohol;
    }

    public Alcohol(String nameProduct, int cost, String typeAlcohol) {
        super(nameProduct, cost);
        this.typeAlcohol = typeAlcohol;

    }

    @Override
    public void Ido() {
        System.out.printf("\nВам продали алкоголь");
    }
}
