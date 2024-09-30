package com.codewars.percict;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersistTest {

    @Test
    void test39() {
        assertEquals(3, Persist.persistence(39), "Incorrect answer for n=39");
    }

    @Test
    void test4() {
        assertEquals(0, Persist.persistence(4), "Incorrect answer for n=4");
    }

    @Test
    void test25() {
        assertEquals(2, Persist.persistence(25), "Incorrect answer for n=25");
    }

    @Test
    void test999() {
        assertEquals(4, Persist.persistence(999), "Incorrect answer for n=999");
    }
}