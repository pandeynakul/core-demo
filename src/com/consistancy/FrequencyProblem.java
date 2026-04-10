package com.consistancy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find the number of count
public class FrequencyProblem {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(5, 4, 6, 89, 21, 5, 89);
        Map<Integer, Long> map = numList.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + "=" + v));

        System.out.println("================****//===================");

        List<String> strList = Arrays.asList("Amanda", "rob", "sunny", "Amanda", "rob");
        Map<String, Long> mappedList = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        mappedList.forEach((k, v) -> System.out.println(k + "=" + v));

        System.out.println("======================================");



    }
}
