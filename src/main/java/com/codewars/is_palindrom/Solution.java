package com.codewars.is_palindrom;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        } else if (x < 10){
            return true;
        }
        int tmp = x;
        int reversed = 0;

        while (tmp >= 0) {
            reversed += tmp % 10;
            if (x == reversed) {
                return true;
            }
            tmp /= 10;
            reversed *= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }
}
