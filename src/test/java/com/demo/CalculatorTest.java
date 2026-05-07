package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAddPositiveNumbers() {
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, c.add(-2, -3));
    }

    @Test
    void testAddWithZero() {
        assertEquals(7, c.add(7, 0));
    }

    @Test
    void testAddMixedNumbers() {
        assertEquals(1, c.add(3, -2));
    }
}