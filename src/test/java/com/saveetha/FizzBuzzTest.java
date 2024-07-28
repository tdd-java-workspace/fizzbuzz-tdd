package com.saveetha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void toReturnOneWhenTheNumberIsOne() {
        int one = 1;
        String stringOne = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actualValue = fizzBuzz.findFizzBuzz(one);

        assertEquals(stringOne, actualValue);
    }

    @Test
    void toReturnFizzWhenTheNumberIsThreeOrMultipleOfThree() {
        int three = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actualValue = fizzBuzz.findFizzBuzz(three);

        assertEquals("Fizz", actualValue);
    }
}
