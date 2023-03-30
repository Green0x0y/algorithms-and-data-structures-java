package org.Tasks.Java.CalculatorTests;
import org.junit.Test;

import static org.Tasks.Java.CalculatorTests.Calculator.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd(){

        assertEquals(2.0, add(1.0, 1.0), 0.0);
        assertEquals(0.0, add(2.0, -2.0), 0.0);
    }
    @Test
    public void testSubtraction() {
        assertEquals(4.0, subtract(2.0, -2.0), 0.0);
        assertEquals(0.0, subtract(2.0, 2.0), 0.0);
    }
    @Test
    public void testMultiplication() {
        assertEquals(4.0, multiply(2.0, 2.0), 0.0);
        assertEquals(0.0, multiply(0.0, 2.0), 0.0);

    }
    @Test
    public void testDivision(){
        assertEquals(-1.0, divide(2.0, -2.0), 0.0);
        assertEquals(0.0, divide(4.0, 0.0), 0.0);
    }
}
