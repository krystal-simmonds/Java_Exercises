package com.qa.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class streamsExercise1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
        names.stream()
                .filter(str -> !str.startsWith("J"))
                .forEach(x -> System.out.println("Hello " + x));
    }

}
