package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    CalculatorService calc = new CalculatorService();

    @Test
    void testAddPositiveNumbers() {
        assertEquals(5, calc.add(2,3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, calc.add(-2,-3));
    }

    @Test
    void testAddMixedNumbers() {
        assertEquals(1, calc.add(3,-2));
    }

    @Test
    void testAddWithZero() {
        assertEquals(5, calc.add(5,0));
    }
}