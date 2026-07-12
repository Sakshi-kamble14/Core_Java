package com.sakshi;


import java.util.Scanner;

public class reverse_last_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		int i=str.length()-1;
		
		
		while(i>=0 && str.charAt(i)==' ')
	            i--;
		
		while(i>=0 && str.charAt(i)!=' ') {
				sb.append(str.charAt(i));		
			i--;
		}
		
		System.out.println(sb);
		
		sc.close();
	}

}
