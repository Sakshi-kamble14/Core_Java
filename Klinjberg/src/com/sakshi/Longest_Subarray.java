package com.sakshi;

import java.util.Scanner;

//Problem Statement
//
//Given an array of integers, find the length of the longest contiguous (continuous) subarray that is either:
//
//Strictly Increasing (every next element is greater than the previous one), or
//Strictly Decreasing (every next element is smaller than the previous one).
//
//Return the maximum length among both increasing and decreasing subarrays.


public class Longest_Subarray {

	public static int Long_Subarray(int []arr) {
		int []newarr=new int[2];
		int inc=1,dec=1;
		int maxIN=1,maxDC=1;
		  for(int i=1;i<arr.length;i++) {
			  if(arr[i]>arr[i-1]) {
				  inc++;
			  }
			  else
				  inc=1;
			  
			  if(arr[i]<arr[i-1]) {
				  dec++;
			  }
			  else
				  dec=1;
		  }
		  
			
		
		  
		  if(inc>maxIN) maxIN=inc;
		  if(dec>maxDC) maxDC=dec;
		
		return Math.max(maxIN, maxDC);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int []arr=new int[size];
		
		for(int i=0;i<size;i++) arr[i]=sc.nextInt();
		
		System.out.println(Long_Subarray(arr));
		
	}

}
