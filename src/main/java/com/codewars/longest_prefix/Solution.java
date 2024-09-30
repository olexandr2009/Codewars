package com.codewars.longest_prefix;

import java.util.Arrays;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String substring;
        Arrays.sort(strs);
        for (int i = 0; i < strs[0].length(); i++) {
            try {
                substring = strs[0].substring(0, i + 1);
            } catch (Exception e) {
                return strs[0];
            }

            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(substring)) {
                    return substring.substring(0, substring.length() - 1);
                }
            }
            if (i + 1 == strs[0].length()) {
                return strs[0];
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"a"}));
    }
}
