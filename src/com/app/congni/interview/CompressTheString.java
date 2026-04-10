package com.app.congni.interview;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CompressTheString {
    public static void main(String[] args) {

       //reverse the Array
        int arr[]= {5, 1, 7, 3, 9, 6};
        int[] reverseArray = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
        System.out.println(Arrays.toString(reverseArray));
        //[6, 9, 3, 7, 1, 5]
    }

}

