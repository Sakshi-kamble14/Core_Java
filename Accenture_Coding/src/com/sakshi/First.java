package com.sakshi;

import java.util.Scanner;

//Problem Description :

//We need to find the **minimum number of houses** required to collect enough food for all the rats.
//
//* Total food needed = **r × unit**
//* Start adding food from each house one by one.
//* As soon as the collected food becomes **greater than or equal to** the required food, return that house count.
//
//**Conditions:**
//
//* If the array is `null`, return **-1**
//* If all houses together don’t have enough food, return **0**
//
//**Example:**
//
//* Rats = 7
//* Food per rat = 2
//* Total needed = **14**
//
//Array = `[2, 8, 3, 5, 7, 4, 1, 2]`
//
//Step by step:
//
//* House 1 → 2
//* House 2 → 2+8 = 10
//* House 3 → 10+3 = 13
//* House 4 → 13+5 = 18 ✅ (enough)
//
//So, the answer is **4** (first 4 houses are enough).

public class First {

	public static int solution(int []arr,int res) {
		int count=0,sum=0;
		  for(int i=0;i<arr.length;i++) {
			  sum+=arr[i];
			  count++;
			  if(sum>=res)  break;
			  
		  }
		  if(sum<res) return 0;
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size,rate,food;
		size=sc.nextInt();
		rate=sc.nextInt();
		food=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++)  arr[i]=sc.nextInt();
              System.out.println(solution(arr, rate*food));
	}

}
