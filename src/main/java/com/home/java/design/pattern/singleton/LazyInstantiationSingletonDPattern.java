package com.home.java.design.pattern.singleton;
//In such case, we create the instance of the class in synchronized method or 
//synchronized block, so instance of the class is created when required.

public class LazyInstantiationSingletonDPattern
{ 
	public static void main(String[] args)
	{
		B obj=B.getB();
		obj.display();
	}
}
