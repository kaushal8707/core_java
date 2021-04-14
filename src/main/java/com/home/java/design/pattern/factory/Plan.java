package com.home.java.design.pattern.factory;

abstract class Plan
{
   protected double rate;
   abstract void getRate();
   
   public void calculateBill(int units)
   {
	   System.out.println("  Bill Amounts:  "+ (rate*units)); 
   }
}
