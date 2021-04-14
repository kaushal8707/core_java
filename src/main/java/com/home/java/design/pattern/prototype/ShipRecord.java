package com.home.java.design.pattern.prototype;

public class ShipRecord implements Prototype
{
  private String name;
  private double latitude;
  private int length;
  private double coarse;
  
	 public ShipRecord()
	 {
		System.out.println("ship record are----");
		System.out.println("Name   "+"Latitude   "+"Length   "+"Coarse   "); 
		System.out.println();
	 }
	public ShipRecord(String name, double latitude, int length, double coarse) 
	{
		this();
		this.name = name;
		this.latitude = latitude;
		this.length = length;
		this.coarse = coarse;
	} 
    
	public void showRecord()
	{
		System.out.println(name+"   "+latitude+"   "+length+"   "+coarse+"   "); 
	}
	
	@Override
	public Prototype getClone() 
	{
		return new ShipRecord(name, latitude, length, coarse);  
	}
	
	
  
}
