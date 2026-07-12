package com.sakshi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class display_prime {

	public static boolean isPrime(int num) {
		if(num<=1) return false;
		
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) return false;
		}
		
		return true;
	}
	
	public static List<Integer> sumOfPrimes(int range) {
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=2;i<range;i++)
		{
			if(isPrime(i))
				list.add(i);
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        
        List<Integer> primelist=new ArrayList<Integer>();
        
        primelist=sumOfPrimes(range);
        
        for (Integer integer : primelist) {
			System.out.print(integer+" ");
		}
        
        sc.close();
	}

}
