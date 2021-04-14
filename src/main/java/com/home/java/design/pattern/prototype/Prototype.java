package com.home.java.design.pattern.prototype;

//Prototype Pattern says that cloning of an existing object instead of creating 
//new one and can also be customized as per the requirement. 

//When the classes are instantiated at runtime.
//When the cost of creating an object is expensive or complicated.
//When you want to keep the number of classes in an application minimum.

public interface Prototype
{
  public Prototype getClone();
}
