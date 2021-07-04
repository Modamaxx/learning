package com.learning.airport.exceptions;

import com.learning.airport.Passenger;
import com.learning.airport.Pilot;

public class FlyException extends Exception {

    public static void  fly(Passenger passenger){
        try {
            Pilot pilot = new Pilot(2, "Центр", 4, "Где-то еще");
            pilot.iFly(pilot.getDuckAirplane());
            pilot.iFly(pilot.getNormalAirplane());
            if (pilot.getWorkExperience() >= 2) {
                System.out.printf("\nВы долетили");
            } else {
                throw new FlyException("\nПилот совершил ошибку и вы разбились");


            }
        } catch (FlyException e) {
            System.out.printf(e.getMessage());
            System.exit(0);
        }
    }
    public FlyException(String messageError) {
        super(messageError);
    }
}
