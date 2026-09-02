package com.dassault;

import java.util.Scanner;

public class Merge_sorted_array {

    public static void merge_sorted_array(int[] arr1, int m, int[] arr2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {

            if (i >= 0 && arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } 
            else {
                arr1[k] = arr2[j];
                j--;
            }

            k--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m + n];
        int[] arr2 = new int[n];

        for (int i = 0; i < m; i++)
            arr1[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();

        merge_sorted_array(arr1, m, arr2, n);

        for (int ele : arr1)
            System.out.print(ele + " ");

        sc.close();
    }
}