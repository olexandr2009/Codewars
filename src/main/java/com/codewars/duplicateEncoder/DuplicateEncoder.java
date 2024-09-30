package com.codewars.duplicateEncoder;


import java.util.stream.Collectors;

public class DuplicateEncoder {
    public static String encode(String word){
        return word.toLowerCase()
                .chars()
                .boxed()
                .map(i -> String.valueOf((char) i.intValue()))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }
}
