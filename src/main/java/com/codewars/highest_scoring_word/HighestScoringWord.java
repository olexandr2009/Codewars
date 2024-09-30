package com.codewars.highest_scoring_word;

import java.util.HashMap;
import java.util.Map;

public class HighestScoringWord {
    private static final Map<String,Integer> SCORE_LETTER = new HashMap<>();
    static {
        init();
    }
    public static String highestWordScore(String s) {
        String[] words = s.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word: words) {
            map.put(word, countScore(word));
        }
        return map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow()
                .getKey();
    }
    public static int countScore(String word){
        String[] letters = word.split("");
        int count = 0;
        for (String letter : letters) {
            count += SCORE_LETTER.get(letter);
        }
        return count;
    }
    private static void init(){
        for (int i = 'a'; i <= 'z'; i++) {
            SCORE_LETTER.put(String.valueOf((char) i),i - 96);
        }
    }
}
