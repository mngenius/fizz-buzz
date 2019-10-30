package com.mngen.service;

import static com.mngen.service.ConstantUtils.*;
import static com.mngen.service.ConstantUtils.FIZZ;

public interface FizzBuzzService {

    /**
     *
     * @param candidate an integer param to check fizzBuzz rules against
     * @return fizz, buzz, fizzBuzz or a string representation of the given number
     */
    default String processNumber(int candidate) {

        if (check15(candidate, FACTOR_15)) return FIZZ_BUZZ;
        if (check(candidate, FACTOR_5)) return BUZZ;
        if (check(candidate, FACTOR_3)) return FIZZ;

        return String.valueOf(candidate);
    }

    boolean check(int candidate, int factor);
    boolean check15(int candidate, int factor);
}
