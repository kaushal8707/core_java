package com.home.java.collection.programs;

import java.util.Comparator;


public class CompId implements Comparator<Emps>
{
   @Override
   public int compare(Emps e1,Emps e2)
   {
	   return e2.getId().compareTo(e1.getId());
   }
}
