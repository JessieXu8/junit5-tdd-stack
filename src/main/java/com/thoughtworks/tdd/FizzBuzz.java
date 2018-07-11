package com.thoughtworks.tdd;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        StringBuffer result =new StringBuffer();
        if(String.valueOf(number).indexOf('3') > -1){
            result.append("Fizz");
        }else {
            if (number % 3 == 0) {
                result.append("Fizz");
            }
            if (number % 5 == 0) {
                result.append("Buzz");
            }
            if (number % 7 == 0) {
                result.append("Whizz");
            }
        }

        return "".equals(result.toString())? String.valueOf(number) : result.toString();
    }
}
