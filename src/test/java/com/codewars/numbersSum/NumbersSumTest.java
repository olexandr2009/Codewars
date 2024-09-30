package com.codewars.numbersSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum s = new NumbersSum();

    @Test
    public void Test1() {
        assertEquals(1, s.GetSum(0, 1));
    }
    @Test
    public void TestMinus1() {
        assertEquals(-1, s.GetSum(0, -1));
    }
    @Test
    public void Test10() {
        assertEquals(10, s.GetSum(0, 4));
    }
    @Test
    public void Test7() {
        assertEquals(7, s.GetSum(-2, 4));
    }


}