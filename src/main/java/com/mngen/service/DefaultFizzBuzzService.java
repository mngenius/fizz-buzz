package com.mngen.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultFizzBuzzService implements FizzBuzzService {

    /**
     * check whether the number is divisible by the factor
     * @param candidate an integer param to check division for a given factor
     * @param factor division factor
     * @return boolean representation of rest division
     */
    @Override
    public boolean check(int candidate, int factor) {
        if(candidate <= 0) {
            log.error("you should provide positive non zero value");
            return false;
        }
        return candidate % factor == 0;
    }

    @Override
    public boolean check15(int candidate, int factor) {
        return check(candidate, factor);
    }
}
