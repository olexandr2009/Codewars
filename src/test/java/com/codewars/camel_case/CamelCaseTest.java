package com.codewars.camel_case;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {

    @Test
    public void testTwoWords() {
        assertEquals("TestCase", CamelCase.camelCase("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", CamelCase.camelCase("camel case method"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", CamelCase.camelCase(" camel case word"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", CamelCase.camelCase("say hello "));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", CamelCase.camelCase("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", CamelCase.camelCase("ab  c"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", CamelCase.camelCase(""));
    }
}