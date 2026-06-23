package com.sunbeam;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println("Before");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		int l=0,r=n-1;
		 	while(l<=r) {
		 		int temp=arr[l];
		 		arr[l]=arr[r];
		 		arr[r]=temp;
		 		l++;
		 		r--;
		 	}
		 	System.out.println("After");
		 	for (int i : arr) {
				System.out.print(i+" ");
			}
		sc.close();

	}

}
