package com.saveetha;

public class FizzBuzz {

    public String of(int number) {
        if( isNumberDivisibleByFifteen(number) || isNumberContainsFifteen(number) ) {
            return "FizzBuzz";
        }
        if( isNumberDivisibleByThree(number) || isNumberContainsThree(number) ) {
            return "Fizz";
        }
        if( isNumberDivisibleByFive(number) || isNumberContainsFive(number) ) {
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

    private static boolean isNumberContainsThree(int number) {
        return Integer.toString(number).contains("3");
    }

 private static boolean isNumberContainsFive(int number) {
        return Integer.toString(number).contains("5");
    }

 private static boolean isNumberContainsFifteen(int number) {
        return Integer.toString(number).contains("15");
    }
}
