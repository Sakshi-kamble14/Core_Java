package com.dassault;

import java.util.Scanner;

public class missin_number {

	public static int missnumber(int []arr) {
		int acutalsum=0,sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		acutalsum = (arr.length * (arr.length + 1)) / 2;
		return acutalsum-sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println(missnumber(arr));
		sc.close();

	}

}
