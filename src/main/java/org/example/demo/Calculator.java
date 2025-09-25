package org.example.demo;

/**
 * Tiny calculator used to demo CI checks.
 */
public class Calculator {

    /** Returns a + b. */
    public int add(int a, int b) {
        return a + b;
    }

    /** Returns a - b. */
    public int subtract(int a, int b) {
        return a - b;
    }

    /** Returns a * b. */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Returns a / b (integer division).
     * @throws IllegalArgumentException if b == 0
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b must not be zero");
        }
        return a / b;
    }
}
