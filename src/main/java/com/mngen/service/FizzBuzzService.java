package com.mngen.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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

        if (check(candidate, 15)) return FIZZ_BUZZ;
        if (check(candidate, 5)) return BUZZ;
        if (check(candidate, 3)) return FIZZ;

        return String.valueOf(candidate);
    }

    private boolean check(int candidate, int factor) {
        if(candidate <= 0) {
            log.error("you should provide positive non zero value");
            return false;
        }
        return candidate % factor == 0;
    }
}
