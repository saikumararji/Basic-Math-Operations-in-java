package com.day12.objectelc;

import java.util.Scanner;

import com.day12.objectblc.Dog;


public class DogElc 
{
	public static void main(String[] args)
	{
		Dog dog1 = new Dog();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter dog name :");
		dog1.name = sc.nextLine();
		
		System.out.print("enter dog height :");
		dog1.height = sc.nextDouble();
		
		System.out.print("enter dog age :");
		dog1.age = sc.nextInt();
		
		dog1.getDogInformation();
		dog1.bark();
		
		sc.close();
	}

}
