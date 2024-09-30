package com.codewars.roman_to_int;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class Solution {
    static Map<String,Integer> map = Map.of("I",1,
            "V",5, "X",10,
            "L",50, "C",100,
            "D", 500, "M", 1000
    );
    public static int romanToInt(String s) {
        String[] romanNumber = s.split("");
        List<Integer> list = Arrays.stream(romanNumber).map(map::get).toList();
        System.out.println(list);
        int answer = 0;
        for (int i = 0; i < romanNumber.length - 1; i++) {
            if (list.get(i) >= list.get(i+1)){
                answer += list.get(i);
            } else {
                answer -= list.get(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
