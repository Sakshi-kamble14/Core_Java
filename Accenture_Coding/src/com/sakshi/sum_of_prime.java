package com.sakshi;

import java.util.Scanner;

public class sum_of_prime {

	public static boolean isPrime(int num) {
		if(num<=1) return false;
		
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) return false;
		}
		
		return true;
	}
	
	public static long sumOfPrimes(int range) {
		long sum=0;
		for(int i=2;i<range;i++)
		{
			if(isPrime(i))
				sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        
        System.out.println(sumOfPrimes(range));
        
        sc.close();
	}

}
