package test;

public class Steward extends Worker {
    Alcohol alcohol;
    Cigarettes cigarettes;

    public Steward(String typeAlcohol, String company, int cost,int quantity, String companyC, int costC) {
        super();
        alcohol = new Alcohol(typeAlcohol, cost, company);
        cigarettes = new Cigarettes(companyC, costC, quantity);
        Who();
    }
   public void Who(){
        System.out.printf("\n!Вы вошли в зал ожидания!\n");
    }

  public static void cry(CompanyProduct companyProduct){
        companyProduct.Ido();
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }

    public Cigarettes getCigarettes() {
        return cigarettes;
    }

    public void setCigarettes(Cigarettes cigarettes) {
        this.cigarettes = cigarettes;
    }
}
