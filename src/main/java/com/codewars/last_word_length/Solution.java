package com.codewars.last_word_length;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }

}
