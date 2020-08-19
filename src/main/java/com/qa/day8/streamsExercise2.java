package com.qa.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class streamsExercise2 {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(3, 4, 7, 8, 12);
        int product =
                number.stream()
                    .reduce((a, b) -> a * b)
                    .get();

        System.out.println(product);
    }

}
