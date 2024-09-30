package com.codewars.arrayDiff;


import java.util.Arrays;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here

        for (int i = 0; i < a.length; i++) {
            for (int k : b) {
                if (a[i] == k) {
                    a[i] = -9999999;
                    break;
                }
            }
        }

        return Arrays.stream(a).filter(integer -> integer != -9999999).toArray();
    }
}
