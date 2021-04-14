package com.home.java.design.pattern.singleton;
///In such case, we create the instance of the class in synchronized method or
//synchronized block, so instance of the class is created when required.
public class B
{

    //static member holds only one instance of the B class.
    private static B obj;

    //prevents the instantiation from any other class.
    private B(){}

    //Now we are providing gloabal point of access.
    public static B getB()
    {
        if(obj==null)
        {
            synchronized (B.class)
            {
                if(obj==null)
                {
                    obj=new B();  //instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void display()
    {
        System.out.println("----Inside Lazy Display----");
    }
}
