package com.mngen;

import com.mngen.service.DefaultFizzBuzzService;
import com.mngen.service.FizzBuzzExtService;
import com.mngen.service.FizzBuzzService;

import java.util.stream.IntStream;

public class FizzBuzzApplication {

    public static void main(String[] args) {
        FizzBuzzService fizzBuzzService = new DefaultFizzBuzzService();

        IntStream.range(1, 100)
                .mapToObj(fizzBuzzService::processNumber)
                .forEach(System.out::println);

        FizzBuzzService fizzBuzzExtService = new FizzBuzzExtService();

        IntStream.range(101, 15)
                .mapToObj(fizzBuzzExtService::processNumber)
                .forEach(System.out::println);
    }
}
