package com.sakshi;

import java.util.Scanner;

public class merge_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		int []arr1=new int[size1];
		int []arr2=new int[size2];
		int []mergearr=new int[size1+size2];
		
		for(int i=0;i<size1;i++)
			arr1[i]=sc.nextInt();
		
		for(int i=0;i<size2;i++)
			arr2[i]=sc.nextInt();
		
		int i=0,j=0,k=0;
		
		while(i<size1 && j<size2) {
			if(arr1[i]<=arr2[j])
				mergearr[k++]=arr1[i++];
			else
				mergearr[k++]=arr2[j++];
		}
		
		while(i<size1)
			mergearr[k++]=arr1[i++];
		
		while(j<size2)
			mergearr[k++]=arr2[j++];
		
		for (int ele : mergearr) {
			System.out.print(ele+" ");
		}
		sc.close();

	}

}
