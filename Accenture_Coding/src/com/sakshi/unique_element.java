package com.sakshi;

import java.util.*;


public class unique_element {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> uniqueElements = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int x : arr) {
            if (!seen.contains(x)) {
                uniqueElements.add(x);
                seen.add(x);
            }
        }

        for (int i = 0; i < uniqueElements.size(); i++) 
            System.out.print(uniqueElements.get(i)+" ");
         
        sc.close();
    }
}