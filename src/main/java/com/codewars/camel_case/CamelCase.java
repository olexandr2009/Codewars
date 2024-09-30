package com.codewars.camel_case;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {
    public static String camelCase(String str) {
        return Arrays.stream(str.split("\\s+"))
                .filter(s -> !s.isEmpty())
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase())
                .collect(Collectors.joining());
    }
}
