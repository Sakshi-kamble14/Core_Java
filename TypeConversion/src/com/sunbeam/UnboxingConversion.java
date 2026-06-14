package com.sunbeam;

public class UnboxingConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer(10); // Reference Type

		double num1 = i1.doubleValue(); // Primitive Type - Unboxing
		// Conveting the reference typr to the value type is unboxing
		System.out.println("Before unboxing - "+i1);
		System.out.println("After unboxing - "+num1);
		
	}


}
