package com.sakshi;

import java.util.Scanner;

public class length_of_last_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int length=0;
		int i=str.length()-1;
		
		while(i>=0 && str.charAt(i)==' ')
	            i--;
		
		while(i>=0 && str.charAt(i)!=' ') {
			length++;
			
			i--;
		}
		
		System.out.println(length);
		
		sc.close();
	}

}
