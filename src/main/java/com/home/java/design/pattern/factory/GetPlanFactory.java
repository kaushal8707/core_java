package com.home.java.design.pattern.factory;

//A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an 
//object but let the subclasses decide which class to instantiate.

//Factory Method Pattern allows the sub-classes to choose the type of objects to create.

//When a class doesn't know what sub-classes will be required to create
//When a class wants that its sub-classes specify the objects to be created.
public class GetPlanFactory 
{
  public Plan getPlan(String PlName)
  {
	  if(PlName==null)
	  {
		  return null;
	  }
	  if(PlName.equalsIgnoreCase("CommercialPlan"))
	  {
		  return new CommercialPlan();
	  }else if(PlName.equalsIgnoreCase("DomesticPlan"))
	  {
		  return new DomesticPlan();
	  }else if(PlName.equalsIgnoreCase("InstitutionalPlan"))
	  {
		  return new InstitutionalPlan();
	  }
	  return null;
  }
}
