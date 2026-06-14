package com.sunbeam;

public class BoxingConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10; // primitive type
		Integer i1 = new Integer(10); // Object // NON Primitive (Reference type)

		Integer i2 = new Integer(num1); // Reference Type - Boxing
		// Converting the primitive type to Reference type is called as Boxing
		
		System.out.println("i1 - "+i1);
		System.out.println("i2 - "+i2);
	}
}
