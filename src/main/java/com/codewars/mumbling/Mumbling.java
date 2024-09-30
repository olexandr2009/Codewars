package com.codewars.mumbling;

import java.util.StringJoiner;

public class Mumbling {
    public static String accum(String s) {
        // your code
        String[] symbols = s.split("");
        StringJoiner sj = new StringJoiner("-");
        for (int i = 0; i < symbols.length; i++) {
            String symbol = symbols[i];
            String s1 = makePattern(symbol, i);
            sj.add(s1);
        }

        return sj.toString();
    }

    private static String makePattern(String symbol,int times){
        StringBuilder sb = new StringBuilder(symbol.toUpperCase());
        String sInL = symbol.toLowerCase();
        sb.append(sInL.repeat(Math.max(0, times)));
        return sb.toString();
    }
}
