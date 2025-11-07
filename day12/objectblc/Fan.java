package com.day12.objectblc;

public class Fan {

	public String name;
	public String coil;
	public int wings;
	
	public void switchOn() 
	{
		System.out.println("Fan name is : "+name);
		System.out.println("Fan coil is : "+coil);
		System.out.println("Fan contains how many wings : "+wings);
	}
	
	public void switchOff() 
	{
		System.out.println(name+ " will not work whenever Someone Switchoff the switch");
	}
}
