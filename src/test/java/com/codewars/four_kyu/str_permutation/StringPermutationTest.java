package com.codewars.four_kyu.str_permutation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StringPermutationTest {
    @Test
    public void example1() {
        assertEquals(new ArrayList<String>(Arrays.asList("a")),
                StringPermutation.singlePermutations("a").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void example2() {
        assertEquals(new ArrayList<String>(Arrays.asList("ab", "ba")),
                StringPermutation.singlePermutations("ab").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void example3() {
        assertEquals(new ArrayList<String>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                StringPermutation.singlePermutations("aabb").stream().sorted().collect(Collectors.toList()));
    }
}