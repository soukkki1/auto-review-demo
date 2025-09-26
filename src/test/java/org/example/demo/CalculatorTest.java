package org.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add_works() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void subtract_works() {
        assertEquals(-1, calc.subtract(2, 3));
    }

    @Test
    void multiply_works() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void divide_works() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void divide_by_zero_throws() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
    }
}
