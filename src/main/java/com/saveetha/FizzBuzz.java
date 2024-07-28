package com.saveetha;

public class FizzBuzz {

    public String findFizzBuzz(int number) {
        if(number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
