package com.day11.blc;

public class NextMultipleOfHundred 
{
	public static int getNextMultipleOfHundred(int num) 
	{
		int nextMultiple=((num/100)+1)*100;
		
		return nextMultiple;
	}
}
