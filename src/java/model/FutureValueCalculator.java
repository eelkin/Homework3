/*
Copyright (c) 2016 Christy Smith
Campus Box 7915, Elon University, Elon, NC 27244

Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244
*/
package model;

public class FutureValueCalculator {
    
    public static double findFutureValue (double investmentAmount, 
      double yearlyInterestRate, int numberOfYears) {
      return investmentAmount * Math.pow(1 + yearlyInterestRate / 100, numberOfYears);
    }
    
}

