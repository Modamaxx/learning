package test;

import test.Worker;

public class Officer extends Worker {
    public Officer()
    {
        super();
        Who();
    }
  public void Who(){
      System.out.printf("\n!Вас проверяет ТАМОЖЕННИК!\n");
    }
}
