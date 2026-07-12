package com.sakshi;

import java.util.Scanner;
import java.util.TreeSet;

public class merge_sort_array_unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		int []arr1=new int[size1];
		int []arr2=new int[size2];
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		for(int i=0;i<size1;i++)
			arr1[i]=sc.nextInt();
		
		for(int i=0;i<size2;i++)
			arr2[i]=sc.nextInt();
		
		for(int i=0;i<size1;i++)
			set.add(arr1[i]);
		
		for(int i=0;i<size2;i++)
			set.add(arr2[i]);
		
		
		for (Integer integer : set) {
			System.out.print(integer+" ");
		}
		
		sc.close();

	}

}
