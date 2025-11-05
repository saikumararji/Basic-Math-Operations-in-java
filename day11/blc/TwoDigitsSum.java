package com.day11.blc;

public class TwoDigitsSum {

	public static void getSumOfDigits(int x) {
		
		int sum=0;
		while(x!=0) 
		{
			sum+=x%10;
			x/=10;
		}
		System.out.println("Sum of digits is :"+sum);
	}
}


