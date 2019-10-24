package com.mngen.service;

public class FizzBuzzService {

    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String FIZZ_BUZZ = "fizzBuzz";

    /**
     *
     * @param candidate an integer param to check fizzBuzz rules against
     * @return fizz, buzz, fizzBuzz or a string representation of the given number
     */
    public String processNumber(int candidate) {

        if(candidate == 0) {
            return String.valueOf(candidate);
        }
        if(candidate%15 == 0) {
            return FIZZ_BUZZ;
        }
        if(candidate%5 == 0) {
            return BUZZ;
        }
        if(candidate%3 == 0) {
            return FIZZ;
        }
        return String.valueOf(candidate);
    }
}
