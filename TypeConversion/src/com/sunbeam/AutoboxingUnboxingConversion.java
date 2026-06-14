package com.sunbeam;

public class AutoboxingUnboxingConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		Integer i1 = num1; // AutoBoxing

		Double d1 = new Double(20.56);
		double num2 = d1; // AutoUnBoxing
		
		System.out.println("Autoboxing - "+i1);
		System.out.println("Autounboxing - "+num2);
	}

}
