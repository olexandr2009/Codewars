package com.codewars.percict;

public class Persist {
    public static int persistence(long n) {
        if (n < 0 ){
            throw new IllegalArgumentException("n is incorrect");
        }
        String number = String.valueOf(n);
        int res = 0;
        if (number.length() <= 1){
            return res;
        }
        do {
            number = multiplyDigits(number);
            res++;
        } while (number.length() != 1);
        return res; // your code
    }
    private static String multiplyDigits(String number){
        String[] numbers = number.split("");
        int res = 1;
        for (String s : numbers) {
            res *= Integer.parseInt(s);
        }
        return String.valueOf(res);
    }
}
