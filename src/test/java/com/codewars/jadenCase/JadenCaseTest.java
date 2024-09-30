package com.codewars.jadenCase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {

    JadenCase jadenCase;
    @BeforeEach
    void initJadenCase(){
        jadenCase = new JadenCase();
    }


    @Test
    void testJadenCaseWorkOk() {
        assertEquals( "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"),"toJadenCase doesn't return a valide JadenCase String! try again please :)");
    }

    @Test
    void testNullArg() {
        assertNull(jadenCase.toJadenCase(null),"Must return null when the arg is null");
    }

    @Test
    void testEmptyArg() {
        assertNull(jadenCase.toJadenCase(""),"Must return null when the arg is empty string");
    }
}