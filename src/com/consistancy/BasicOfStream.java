package com.consistancy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicOfStream {

    public static void main(String[] args) {

        //convert primitive [] to stream
        int[] primitiveArr = {9, 8, 7, 6, 5, 4};
        System.out.println(primitiveArr);
        //convert into the stream
        IntStream primArray = Arrays.stream(primitiveArr);
        //print the array iterate
        primArray.forEach(System.out::print);
        System.out.println("==========+++=============");
        //convert the object or wrapper class to stream
        Integer[] objectArray = {9, 8, 7, 6, 5, 4};
        Stream<Integer> integerStream = Stream.of(objectArray);
        System.out.println(integerStream);
        System.out.println("========================");
        List<Integer> list = Arrays.asList(9, 8, 7, 6, 5, 4);
        System.out.println(list);
        Stream<Integer> stream1 = list.stream();
        stream1.forEach(x -> System.out.println(x));


    }
}
