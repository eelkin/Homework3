/*
Copyright (c) 2016 Christy Smith
Campus Box 7915, Elon University, Elon, NC 27244

Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244
*/
package model;

import java.io.Serializable;

public class Calculator implements Serializable {
  private double investmentAmount;
  private double yearlyInterestRate;
  private int numberOfYears;
  private double futureValue;
  private double[] futureValues;
    
  public Calculator() {
    investmentAmount = 0;
    yearlyInterestRate = 0;
    numberOfYears = 0;
    futureValue = 0;
    futureValues = new double[numberOfYears];
  }
    
  public Calculator(double investmentAmount, double yearlyInterestRate, 
      int numberOfYears, double futureValue) {
      this.investmentAmount = investmentAmount;
      this.yearlyInterestRate = yearlyInterestRate;
      this.numberOfYears = numberOfYears;
      this.futureValue = futureValue;
    }
    
    public double getInvestmentAmount() {
      return investmentAmount;
    }
    
    public void setInvestmentAmount(double investmentAmount) {
      this.investmentAmount = investmentAmount;
    }
    
    public double getYearlyInterestRate() {
      return yearlyInterestRate;
    }
    
    public void setYearlyInterestRate(double yearlyInterestRate) {
      this.yearlyInterestRate = yearlyInterestRate;
    }
    
    public int getNumberOfYears() {
      return numberOfYears;
    }
    
    public void setNumberOfYears(int numberOfYears) {
      this.numberOfYears = numberOfYears;
    }
    
    public double getFutureValue() {
      return futureValue;
    }
    
    public void setFutureValue(double futureValue) {
      this.futureValue = futureValue;
    }
    
    
    public double[] getFutureValues() {
      return futureValues;
    }
    
    public void setFutureValues(double[] futureValues) {
      this.futureValues = FutureValueCalculator.findFutureValues(investmentAmount, yearlyInterestRate, numberOfYears);
    }
    
}
