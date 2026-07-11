package com.sakshi;

import java.util.Scanner;

public class Equalibrium_Point {

	public static int findEqualibrium(int[] arr, int totalSum) {
		// TODO Auto-generated method stub
		int leftSum=0;
		for(int i=0;i<arr.length;i++) {
			totalSum-=arr[i];
			if(leftSum==totalSum) {
				return i;
			}
			leftSum+=arr[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		int totalSum=0;
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			totalSum+=arr[i];
		}
         System.out.println(findEqualibrium(arr,totalSum));
	}

	

}
