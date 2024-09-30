package com.codewars.prod_fib;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProdFibTest {
    @Test
    public void test1() {
        long[] r = new long[] {55, 89, 1};
        long[] actual = ProdFib.productFib(4895);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(r, actual);
    }
    @Test
    public void test2() {
        long[] r = new long[]{89, 144, 0};
        assertArrayEquals(r, ProdFib.productFib(5895));
    }
}