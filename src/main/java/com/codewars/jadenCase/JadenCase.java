package com.codewars.jadenCase;


public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()){
            return null;
        }
        //TODO put your code below this comment
        char[] symbols = phrase.toCharArray();
        symbols[0] = Character.toUpperCase(symbols[0]);
        for (int i = 0; i < symbols.length-1;i++) {
            if (symbols[i] == ' '){
                symbols[i + 1] = Character.toUpperCase(symbols[i+1]);
            }
        }
        return new String(symbols);
    }

}
