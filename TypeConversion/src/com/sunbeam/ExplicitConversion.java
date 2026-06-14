package com.sunbeam;

import java.util.Scanner;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number - ");
		double d=sc.nextDouble();
		int number=(int) d;
		System.out.println("Before narrowing - "+d);
		System.out.println("After narrowing - "+number);
		sc.close();

	}

}
