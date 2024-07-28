package com.saveetha;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private static  FizzBuzz fizzBuzz;

    @BeforeAll
    static void beforeAll() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void toReturnOneWhenTheNumberIsOne() {
        int one = 1;
        String stringOne = "1";

        String actualValue = fizzBuzz.findFizzBuzz(one);

        assertEquals(stringOne, actualValue);
    }

    @Test
    void toReturnFizzWhenTheNumberIsThreeOrMultipleOfThree() {
        int three = 3;

        String actualValue = fizzBuzz.findFizzBuzz(three);

        assertEquals("Fizz", actualValue);
    }

    @Test
    void toReturnBuzzWhenTheNumberIsFiveOrMultipleOfFive() {
        int five = 5;

        String actualValue = fizzBuzz.findFizzBuzz(five);

        assertEquals("Buzz", actualValue);
    }

    @Test
    void toReturnFizzBuzzWhenTheNumberIsFifteenOrMultipleOfFifteen() {
        int fifteen = 15;

        String actualValue = fizzBuzz.findFizzBuzz(fifteen);

        assertEquals("FizzBuzz", actualValue);
    }
}
