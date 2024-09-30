package com.codewars.highest_scoring_word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestScoringWordTest {
    @Test
    public void sampleTests() {
        assertEquals("taxi", HighestScoringWord.highestWordScore("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.highestWordScore("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.highestWordScore("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", HighestScoringWord.highestWordScore("aa b"));
        assertEquals("b", HighestScoringWord.highestWordScore("b aa"));
        assertEquals("bb", HighestScoringWord.highestWordScore("bb d"));
        assertEquals("d", HighestScoringWord.highestWordScore("d bb"));
        assertEquals("aaa", HighestScoringWord.highestWordScore("aaa b"));
    }
}