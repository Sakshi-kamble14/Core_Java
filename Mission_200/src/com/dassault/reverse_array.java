package com.dassault;

import java.util.Scanner;

public class reverse_array {
	
	public static void reverse(int []arr) {
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("reverse array");
		reverse(arr);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
		
		sc.close();

	}

}
