package com.app.javateche;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PractiiceTest {
    public static void main(String[] args) {
        //to count occurance of character in stream
        //ilovejavatechie
        String input = "ilovejavatechie";
        //convvert into the stream
        Map<String, Long> collect = Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        System.out.println("==================");
        //find out all the duplicates from the string

        List<String> duplicateElemnts = Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                //Convert in to the entry set
                        entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).
                        collect(Collectors.toList());
        System.out.println(duplicateElemnts);
        System.out.println("---------------------------------");
        //unique Elemnts in the given stream
        //chreck the value count
        List<String> uniqueElemts = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(uniqueElemts);
        System.out.println("-----------------------------------");


        //find the first non repeated character from the given string

        String firstNonRepeatedChar = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
        System.out.println(firstNonRepeatedChar);
        System.out.println("=================================");
        //secondHighestNumber
        //second lowest number
        int arr[] = {12, 34, 5, 67, 78, 88, 56};
        //sort the array
        Integer secondHighest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println("second HIgehst number :: " + secondHighest);
        //find the second lowest number
        Integer lowestNum = Arrays.stream(arr).boxed().sorted().skip(1).findFirst().get();
        System.out.println("second lowest number :: " + lowestNum);
        System.out.println("================================");

        //find the longest string from the array!!

        String[] listoftech={"microservice","java","springBoot","rest","soap","docker","kubernaDocker"};
        String largestString = Arrays.stream(listoftech).
                reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(largestString);
        System.out.println("===============================");

        //who starts with array 1
        int[] arr2={12,22,33,11,1,78,1};
        //convert to the string
        List<String> startWith1 = Arrays.stream(arr2).boxed().map(s -> s + "")
                .filter(s -> s.startsWith("2")).distinct().collect(Collectors.toList());
        System.out.println(startWith1);
        System.out.println("==========================");
        //use the string.join
        List<String> list = Arrays.asList("amir", "ankul", "rajja", "rahul", "sushil");
        String joined = String.join("-", list);
        System.out.println(joined);
        System.out.println("====================");
        //rangeClosed==Skip and limit example
        //print only 1 to 9
        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(x-> System.out.print(" "+x));
        System.out.println("---------------------------------");




    }
}
