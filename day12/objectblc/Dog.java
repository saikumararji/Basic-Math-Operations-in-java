package com.day12.objectblc;

public class Dog
{
	public String name;
	public double height;
	public int age;
	
	public void getDogInformation() 
	{
		System.out.println("Hello saiee, my name is : "+name);
		System.out.println("my height is : "+height);
		System.out.println("my age is : "+age );
	}
	
	public void bark() 
	{
		System.out.println("whenever someone comes over our home "+name+ " will bark loudly");
	}
}
