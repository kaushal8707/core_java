package com.home.java.design.pattern.singleton;

//In such case, we create the instance of the class at the time of declaring the static data
//member, so instance of the class is created at the time of classloading. 

public class EarlyInstantiationSingletonDPattern 
{
	public static void main(String[] args)
	{
		A obj=A.getA();
		obj.display();
	}

}
