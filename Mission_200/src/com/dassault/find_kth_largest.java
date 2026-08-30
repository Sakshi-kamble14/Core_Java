package com.dassault;

import java.util.Arrays;
import java.util.Scanner;

public class find_kth_largest {

    public static int largest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(largest(arr, k));

        sc.close();
    }
}