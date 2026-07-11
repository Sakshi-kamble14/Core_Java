package com.sakshi;

import java.util.Scanner;


// 451
// 349
// carry generate here 2
public class Count_Carry {
	
	public static int carry_count(int input1, int input2) {
		// TODO Auto-generated method stub
		int count=0,sum,carry=0;
		while(input1!=0 || input2!=0) {
			int val1=input1%10;
			int val2=input2%10;
			
			sum=carry+val1+val2;
			if(sum>9) {
				count++;
				carry=1;
			}
			else
				carry=0;
			input1/=10;
			input2/=10;
		}
		
		return count;
	}
        public static void main(String[] args) {
			
        	Scanner sc=new Scanner(System.in);
        	int input1=sc.nextInt();
        	int input2=sc.nextInt();
        	
        	System.out.println(carry_count(input1,input2));
		}

		
}
