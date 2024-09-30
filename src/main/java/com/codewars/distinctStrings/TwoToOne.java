package com.codewars.distinctStrings;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        // your code
        return Stream.of(s1, s2)
                .flatMap(s -> Arrays.stream(s.split("")))
                .distinct()
                .sorted().collect(Collectors.joining());
    }

}
