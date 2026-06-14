package com.sunbeam;

import java.util.Scanner;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number - ");
		int number=sc.nextInt();
		double d=number;
			System.out.println("Before widening "+number);
			System.out.println("After widening "+d);
			
			sc.close();

	}

}
