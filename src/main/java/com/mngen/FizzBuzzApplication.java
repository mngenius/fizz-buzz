package com.mngen;

import com.mngen.service.FizzBuzzService;

import java.util.stream.IntStream;

public class FizzBuzzApplication {

    public static void main(String[] args) {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        IntStream.range(1, 100)
                .mapToObj(fizzBuzzService::processNumber)
                .forEach(System.out::println);
    }
}
