package com.learning.airport;

import com.learning.airport.interfaces.IWho;

public abstract class Worker implements IWho {
    private int workExperience;

    public Worker() {

        this.workExperience = (int) (Math.random() * 10);
    }

    public abstract void who();

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }


    ;


}
