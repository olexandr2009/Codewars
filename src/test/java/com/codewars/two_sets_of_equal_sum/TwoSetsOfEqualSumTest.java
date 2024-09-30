package com.codewars.two_sets_of_equal_sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoSetsOfEqualSumTest {
    @Test
    void fixedTests()  {
        for (int i = 1; i <= 1; i++) {
            List<List<Integer>> twoSetsOfEqualSum = TwoSetsOfEqualSum.createTwoSetsOfEqualSum(1);
            assertEquals(List.of(new ArrayList<>(),new ArrayList<>()),twoSetsOfEqualSum);
        }
    }

}