package com.morning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OutputGuess {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","banana","cherry","date","fig","graps");
        List<String> result = words.stream().filter(s -> s.length() > 4).map(s -> s.substring(0, 3)).
                sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
