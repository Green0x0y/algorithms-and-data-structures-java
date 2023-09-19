package org.TDD.FizzBuzz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testFizzModulo3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    void testBuzzModulo5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    void testFizzBuzzModulo15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }
}
