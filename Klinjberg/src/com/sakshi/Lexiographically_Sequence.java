package com.sakshi;

import java.util.Scanner;


public class Lexiographically_Sequence {
	public static String minDiffString(String s, int k) {
	    StringBuilder result = new StringBuilder();

	    for (int i = 0; i < k && i < s.length(); i++) {
	        char minChar = 'a';
	        int minDiff = Integer.MAX_VALUE;

	        for (char c = 'a'; c <= 'z'; c++) {
	            int diff = Math.abs(s.charAt(i) - c);
	            diff = Math.min(diff, 26 - diff);

	            if (diff < minDiff) {
	                minDiff = diff;
	                minChar = c;
	            }
	        }

	        result.append(minChar);
	    }

	    return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		int k=sc.nextInt();
		
		System.out.println(minDiffString(str, k));

	}

}
