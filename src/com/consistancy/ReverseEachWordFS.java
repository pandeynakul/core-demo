package com.consistancy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordFS {

    public static void main(String[] args) {

        String input = "not now its time to show";
        String[] word = input.split(" ");
        //perform the operation
        String reverseWord = Stream.of(word).
                map(w -> new StringBuilder(w).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(reverseWord);
        //intersection of the two list
        System.out.println("===*majja aa raha hai coading me !!now i m the best coader*===");
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(8, 9, 0, 6, 2, 3);
        List<Integer> intersection = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(intersection);

        //union of the list
        List<Integer> unionList = Stream.concat(list1.stream(), list2.stream()).distinct().
                collect(Collectors.toList());
        System.out.println(unionList);

        System.out.println("@@Reverse the number@@");
        int number = 1234;
        String reverseNumber = Stream.of(String.valueOf(number).split(" ")).
                map(w -> new StringBuilder(w).reverse().toString()).collect(Collectors.joining());
        System.out.println(reverseNumber);




    }
}
