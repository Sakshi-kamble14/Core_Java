package com.dassault;

import java.util.Scanner;

public class Rotate_array {

	public static void rotate_array(int[] arr, int k) {

	    while (k != 0) {

	        int temp = arr[arr.length - 1];

	        for (int i = arr.length - 1; i > 0; i--) {
	            arr[i] = arr[i - 1];
	        }

	        arr[0] = temp;

	        k--;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		int k=sc.nextInt();
		
		rotate_array(arr, k);
		
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		
		sc.close();

	}

}
