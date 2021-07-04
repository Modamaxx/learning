package test.Exeption;

import test.Steward;

public class WaitException extends Exception {
    public static void WaitExce(Steward steward) {
        try {

            steward.cry(steward.getAlcohol());
            Steward.cry(steward.getCigarettes());
            if (steward.getWorkExperience() <= 2) {
                throw new WaitException("\nВам продали испорченную еду - вы умерли");
            }
        }
        catch (WaitException e){
            System.out.printf(e.getMessage());
            System.exit(0);
        }
    }

    public WaitException(String messageError) {
        super(messageError);
    }
}
