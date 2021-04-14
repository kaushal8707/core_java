package com.home.java.design.pattern.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {

	public static void main(String[] args) throws IOException  
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter Ship name: ");  
        String name=br.readLine();  
        System.out.print("\n");   
          
        System.out.print("Enter Ship Latitude: ");  
        double latitude=Double.parseDouble(br.readLine());  
        System.out.print("\n");  
          
        System.out.print("Enter Ship Length: ");  
        int length=Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        System.out.print("Enter Ship Coarse: ");  
        double coarse=Double.parseDouble(br.readLine());   
        System.out.print("\n");  
          
        ShipRecord record=new ShipRecord(name, latitude, length, coarse) ;
        record.showRecord();
        System.out.println();
        ShipRecord record2=(ShipRecord) record.getClone();
        record2.showRecord(); 
        
	
	}

}
