package com.home.java.design.pattern.singleton;

public class A
{
    //static member holds only one instance of the A class.
    private static A obj=new A();

    //prevents the instantiation from any other class.
    private A(){}

    //Now we are providing gloabal point of access.
    public static A getA()
    {
        return obj;
    }

    public void display()
    {
        System.out.println("-----Inside Display-----");
    }

}
