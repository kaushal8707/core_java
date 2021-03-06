package com.home.java.collection.programs;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
 
public class ConvertArrayListToHashSetExample4_inJava8 {
  public static void main(String[] args) {
      List<Integer> arrayList = new ArrayList<Integer>();
      arrayList.add(1);
      arrayList.add(2);
      arrayList.add(3);
 
      //convert ArrayList to HashSet by
      //passing ArrayList in addAll method of HashSet
      
      Set<Object> hashSet = arrayList.stream().collect(Collectors.toSet());
      
      // Display set
      System.out.println("hashSet = "+hashSet);
  }
}