package com.day11.blc;

public class TwoDigitsDifference 
{

	public static void getDiffOfDigits(int x)
	{
		int dif = x/10;
		int sec = x%10;
		
		System.out.println(dif-sec);
	}
}
