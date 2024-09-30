package com.codewars.numbersSum;

public class NumbersSum {
    public int GetSum(int a, int b) {
        if (a==b){
            return a;
        }
        int sum;
        if (a<b){
            sum = doSum(a, b);
        }else {
            sum = doSum(b, a);
        }
        return sum;
    }
    private int doSum(int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }


        return sum;
    }
}
