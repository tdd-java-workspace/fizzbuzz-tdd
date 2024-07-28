package com.saveetha;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private static  FizzBuzz fizzBuzz;

    @BeforeAll
    static void beforeAll() {
        fizzBuzz = new FizzBuzz();
    }

    // First Requirement
    @Test
    void toReturnOneWhenTheNumberIsOne() {
        int one = 1;

        assertThat(fizzBuzz.of(one), is(equalTo("1")));
    }

    @Test
    void toReturnFizzWhenTheNumberIsThreeOrMultipleOfThree() {
        int three = 3;

        assertThat(fizzBuzz.of(three), is(equalTo("Fizz")));
    }

    @Test
    void toReturnBuzzWhenTheNumberIsFiveOrMultipleOfFive() {
        int five = 5;

        assertThat(fizzBuzz.of(five), is(equalTo("Buzz")));
    }

    @Test
    void toReturnFizzBuzzWhenTheNumberIsFifteenOrMultipleOfFifteen() {
        int fifteen = 15;

        assertThat(fizzBuzz.of(fifteen), is(equalTo("FizzBuzz")));
    }

    @Test
    void toReturnFizzWhenTheNumberContainsThree() {
        int thirteen = 13;

        assertThat(fizzBuzz.of(thirteen), is(equalTo("Fizz")));
    }

    @Test
    void toReturnBuzzWhenTheNumberContainsFive() {
        int fiftyEight = 58;

        assertThat(fizzBuzz.of(fiftyEight), is(equalTo("Buzz")));
    }

    @Test
    void toReturnFizzBuzzWhenTheNumberContainsFifteen() {
        int fiveHundredAndFifteen = 515;

        assertThat(fizzBuzz.of(fiveHundredAndFifteen), is(equalTo("FizzBuzz")));
    }
}
