package com.thoughtworks.tdd;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        StringBuffer result =new StringBuffer();

        if (number % 3 == 0){
            result.append("Fizz");
        }
        if (number % 5 == 0){
            result.append("Buzz");
        }


        return "".equals(result.toString())? String.valueOf(number) : result.toString();
    }
}
