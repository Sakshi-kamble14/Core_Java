package com.dassault;

import java.util.Scanner;

public class duplicate_number {

	public static int duplicatenumber(int []arr) {
		int dup=0,ele=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[dup])
				ele=arr[i];
					
		}
		
		return ele;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println(duplicatenumber(arr));
		sc.close();

	}

}
