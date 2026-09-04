package com.dassault;

import java.util.Scanner;

public class move_zero_at_the_end {
	
	public static void move_zero(int []arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
				arr[j++]=arr[i];
		}
		for(int i=j;i<arr.length;i++)
			arr[i]=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		move_zero(arr);
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		sc.close();

	}

}
