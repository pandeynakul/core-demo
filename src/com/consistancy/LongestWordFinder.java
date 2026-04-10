package com.consistancy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestWordFinder {


    public static void main(String[] args) {

        String input="still hate herokwith";
        String[] arr=input.split(" ");

        //convert array into the stream

        Optional<String> word = Arrays.stream(arr).max(Comparator.comparingDouble(String::length));
        System.out.println(word);


    }
}
