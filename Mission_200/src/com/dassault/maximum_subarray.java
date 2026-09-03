package com.dassault;

import java.util.Scanner;

public class maximum_subarray {

	public static int maximum_subarray(int []arr) {
		int cs=0,ms=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			cs+=arr[i];
			if(cs<0)
				cs=0;
			if(cs>ms)
				ms=cs;
			
		}
		
		return ms;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println(maximum_subarray(arr));
		sc.close();

	}

}
