package com.codewars.prod_fib;

import java.util.Arrays;

public class ProdFib {

    public static long[] productFib(long prod) {
        long a = 0L;
        long b = 1L;
        while (a * b < prod) {
            long tmp = a;
            a = b;
            b = tmp + b;
        }
        return new long[] { a, b, a * b == prod ? 1 : 0 };
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println(Arrays.toString(productFib(i)));
            System.out.println(i);
        }
    }
}