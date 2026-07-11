package com.sakshi;

import java.util.Scanner;

public class Maximum_Exponent_Of_2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		
		int result=input1,maxexp=-1;
		
		 for(int i=input1;i<=input2;i++) {
			 if(i==0) continue;
			 
			 int currnum=i;
			 int currexp=0;
			 
			 while(currnum%2==0) {
				 currexp++;
				 currnum=currnum/2;
			 }
			 if(currexp>maxexp) {
				 maxexp=currexp;
				 result=i;
			 }
		 }
          System.out.println(result);
	}

}
