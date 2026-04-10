package com.public_sapient;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Array program in java 8
public class TopArrayProgram {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5};
        //find the missing number from the list/arry
        List<Integer> list = Arrays.stream(arr).filter(i -> i > 0).sorted()
                .distinct().boxed().collect(Collectors.toList());

        int first = IntStream.range(1, list.size() + 1).filter(i -> !list.contains(i)).findFirst().orElse(1);
        System.out.println(first);

        //get nth largest element in the array::
        int[] arr1 = {1, 2, 3, 6, 5, 18, 13, 17};

        Integer largestElement = Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).get(arr1[0]);
        System.out.println(largestElement);

        System.out.println("===================");
        int nthlargeElement = getNthlargestElement(arr1, 2);
        System.out.println(nthlargeElement);

        //find the duplicates elements inside the array
        //or else distinct
        int[] arr2 = {1, 2, 6, 3, 6, 5, 18, 13, 17, 3, 6, 5};
        Set<Integer> uniqueElemntInArray = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        System.out.println(uniqueElemntInArray);

        //collect duplicate element
        System.out.println("===========================");
        List<Integer> integerList = Arrays.stream(arr2).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).collect(Collectors.toList());
        System.out.println(integerList);

        System.out.println("==========maintain the insertion Order=========");

        Arrays.stream(arr2).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).limit(1).forEach(x -> System.out.println(x));

        //get min and max value
        getMinMAxValue(arr1);

    }

    public static void getMinMAxValue(int[] arr1) {
        int max = Arrays.stream(arr1).max().orElseThrow(() -> new IllegalArgumentException("Empty"));
        System.out.println("maximum :: " + max);

        int min = Arrays.stream(arr1).min().orElseThrow(() -> new IllegalArgumentException("Empty"));
        System.out.println("minimum :: " + min);

        //without java 8 perform the min max

        int min1 = arr1[0];
        int max1 = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            //original logic
            if (min1 > arr1[i]) {
                min1 = arr1[i];
            }
            if(max1 < arr1[i]){
                max1=arr1[i];
            }


        }
        System.out.println(" min1 "+min1+" max1 "+max1);

        System.out.println("===================================");
        int[] arr2 = {0, 2, 6, 3, 0, 5, 0, 13, 17, 3, 0, 5};
        //move all zero to the end of the array!!!

        moveAllZeroToEndOfArray(arr2);

    }

    public static void moveAllZeroToEndOfArray(int[] arr2) {

        //find the non-zero Elements
        int[] nonZeroElements = Arrays.stream(arr2).filter(x -> x > 0).distinct().toArray();
        //find the zero Elements
        long ZeroElements = Arrays.stream(arr2).filter(x -> x == 0).count();

        //concat the both :: with the IntStream

       int[] arrEndWithZeor= IntStream.concat(Arrays.stream(nonZeroElements),
               Arrays.stream(new int[(int) ZeroElements])).toArray();
        System.out.println(Arrays.toString(arrEndWithZeor));

    }

    public static int getNthlargestElement(int[] arr1, int n) {

        Integer nthlargeElement = Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).get(n - 1);

        return nthlargeElement;
    }
}
