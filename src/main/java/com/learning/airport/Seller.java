package com.learning.airport;

public class Seller extends Worker {
   Seller()
   {
       super();
       this.who();
   }
   public void who(){
       System.out.printf("\n!THE OPERATOR sells tickets\n");
   }
}
