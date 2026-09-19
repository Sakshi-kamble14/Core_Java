package com.dassault;

import java.util.HashMap;
import java.util.Scanner;

public class pair_sum {
	
	public static int[] Pair_sum(int[] arr, int target) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			if(map.containsKey(target-num)) {
				return new int[] {i,map.get(target-num)};
			}
			map.put(num, i);
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		int target=sc.nextInt();
		
		int []result=Pair_sum(arr,target);
		System.out.println(result[0]+" "+result[1]);
		
		sc.close();

	}

	

}
