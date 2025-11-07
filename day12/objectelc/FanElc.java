package com.day12.objectelc;

import java.util.Scanner;

import com.day12.objectblc.Fan;

public class FanElc {

	public static void main(String[] args) {
		
		Fan fanName = new Fan();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter fan company name :");
		fanName.name = sc.nextLine();
			
		System.out.print("enter fan Coil :");
		fanName.coil = sc.nextLine();
		
		System.out.print("enter  number of wings :");
		fanName.wings = sc.nextInt();
		
		fanName.switchOn();
		fanName.switchOff();
		
		sc.close();
	}
}
