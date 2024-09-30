package com.codewars.four_kyu.str_permutation;

import java.util.*;
import com.google.common.collect.Collections2;

public class StringPermutation {
    public static List<String> singlePermutations(String s) {
        return Collections2.permutations(List.of(s.split(""))).stream().map(p->String.join("",p)).distinct().toList();
    }
}
