package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 2);
        assertEquals(8, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(8, 2);
        assertEquals(4, result);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(8, 0);
        });
    }

    @Test
    public void testFactorial() {
        Calculator calculator = new Calculator();
        int result = calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialOfZero() {
        Calculator calculator = new Calculator();
        int result = calculator.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        });
    }
}
