package com.codewars.valid_parentheses;

public class Solution {
    public static boolean isValid(String str) {
        String tmp=str;
        while (true) {
            str = str.replace("()", "");
            str = str.replace("{}", "");
            str = str.replace("[]", "");
            if (tmp.equals(str)){
                return str.isEmpty();
            } else {
                tmp = str;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
