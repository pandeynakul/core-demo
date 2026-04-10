package com.newstart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheDuplicates {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        //find the duplicates with java 8
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
       // System.out.println(collect);
        collect.forEach(x-> System.out.println(x));
        System.out.println("++++++++++++++++++++++++");

    }
}
