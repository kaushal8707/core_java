package com.home.java.collection.programs;


import java.util.HashSet; 
import java.util.Set;
public class HashSetTest2 {
    public static void main(String args[]) { 
 
           // creates array with initial capacity of 10.
           Set<String> hashSet = new HashSet<String>();
 
           System.out.println("--------add element ");
           hashSet.add("ankit");
           hashSet.add("mittal");
           hashSet.add("javaMadeSoEasy");
 
           System.out.println("hashSet = "+hashSet);
           System.out.println("hashSet.isEmpty() = "+hashSet.isEmpty());
 
           System.out.println("\n--------clear list - remove all elements from set");
           hashSet.clear();
           
           System.out.println("hashSet.isEmpty() = "+hashSet.isEmpty());
 
           System.out.println("hashSet = "+hashSet);
 
           
    }
}