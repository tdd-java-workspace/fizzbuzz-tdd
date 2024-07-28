package com.saveetha;

public class FizzBuzz {

    public String of(int number) {
        if( isNumberDivisibleByFifteen(number) ) {
            return "FizzBuzz";
        }
        if( isNumberDivisibleByThree(number) ) {
            return "Fizz";
        }
        if( isNumberDivisibleByFive(number) ) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private static boolean isNumberDivisibleByThree(int number) {
        return number % 3 == 0;
    }
    private static boolean isNumberDivisibleByFive(int number) {
        return number % 5 == 0;
    }
    private static boolean isNumberDivisibleByFifteen(int number) {
        return number % 15 == 0;
    }

}
