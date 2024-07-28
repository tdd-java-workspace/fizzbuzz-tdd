package com.saveetha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void toReturnOneWhenTheNumberIsOne() {
        int one = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        int actualValue = fizzBuzz.findFizzBuzz(one);

        assertEquals(one, actualValue);
    }
}
