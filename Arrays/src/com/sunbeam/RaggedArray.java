package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class RaggedArray {

	public static void main(String[] args) {
		
		// 1. Instantiate the row capacity of the 2D array
		int[][] arr = new int[3][];
		
		// 2. Define the column size for each individual row (making it "ragged")
		arr[0] = new int[2]; // Row 0 has 2 columns
		arr[1] = new int[4]; // Row 1 has 4 columns
		arr[2] = new int[3]; // Row 2 has 3 columns
		
		Scanner sc = new Scanner(System.in);
		
		// 3. Accept elements from the user
		System.out.println("Enter array elements: ");
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print("Enter element for arr[" + row + "][" + col + "]: ");
				arr[row][col] = sc.nextInt();
			}
		}
		
//		 4. Display the ragged array
		System.out.println("\nYour Ragged Array looks like this:");
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println(); // New line after each row
		}
		
//		Using the Arrays.toString
		System.out.println("Using Arrays To String - ");
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
		
		System.out.println("Using For Each Loop - ");
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
		sc.close();
	}
}