package com.dassault;

import java.util.HashSet;
import java.util.Scanner;

public class intersection_array {

	public static HashSet intersect_array(int []arr1,int []arr2) {
		HashSet<Integer> set=new HashSet<Integer>();
		HashSet<Integer> result=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
				set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i]))
				result.add(arr2[i]);
		}
		return result;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		
		int []arr1=new int[size1];
		int []arr2=new int[size2];
		
		for(int i=0;i<size1;i++)
			arr1[i]=sc.nextInt();
		for(int i=0;i<size2;i++)
			arr2[i]=sc.nextInt();
		HashSet<Integer> set=intersect_array(arr1, arr2);
		
		for (Integer integer : set) {
			System.out.print(integer+" ");
		}
		sc.close();

	}

}
