package test;

import test.Interface.IWho;

public abstract class Worker implements IWho {
    int workExperience;

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }


  public abstract void Who();
    public Worker() {

        this.workExperience =(int) ( Math.random() * 10);
    }

}
