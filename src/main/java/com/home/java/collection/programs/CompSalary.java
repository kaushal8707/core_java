package com.home.java.collection.programs;

import java.util.Comparator;


public class CompSalary implements Comparator<Emps>
{
   @Override
   public int compare(Emps e1,Emps e2)
   {
	   return e2.getSalary().compareTo(e1.getSalary());  
   }
}
