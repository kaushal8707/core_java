package com.home.java.design.pattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateBill {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your plan Name..."); 
		String planName=bReader.readLine(); 
		System.out.println("Enter No. of Units..."); 
		int units=Integer.parseInt(bReader.readLine()); 
		System.out.println("Plan="+planName+"    "+"Units:"+units);

		GetPlanFactory factory=new GetPlanFactory();
		Plan plan=factory.getPlan(planName); 
	    plan.getRate();
		plan.calculateBill(units); 
		
	}

}
