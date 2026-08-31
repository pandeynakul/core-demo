package com.aug2026;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //convert into the wrapper from integer
        List<Integer> wrapped = Arrays.stream(arr).boxed().collect(Collectors.toList());

        List<List<Integer>> eo = wrapped.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0)).entrySet().stream().
                map(x -> x.getValue()).collect(Collectors.toList());
        eo.forEach(x -> System.out.println(x));
        System.out.println("==================");
        System.out.println("with the help of partition are also possible");
        List<List<Integer>> eo1 = wrapped.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0)).entrySet().stream().
                map(x -> x.getValue()).collect(Collectors.toList());
        eo.forEach(x -> System.out.println(x));


    }
}
