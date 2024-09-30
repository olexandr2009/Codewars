package com.codewars.two_sets_of_equal_sum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSetsOfEqualSum {
    public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {

        final List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        res.add(new ArrayList<Integer>());
        if (n % 4 == 1 || n % 4 == 2) return res;

        final long[] m = new long[2];
        for (int a = n; a > 0; a--) {
            int i = m[0] > m[1] ? 1 : 0;
            res.get(i).add(a);
            m[i] += a;
        }

        return res;
    }
}
