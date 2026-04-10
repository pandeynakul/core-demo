package com.newstart;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalaryNewBegning {
    
    
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap();
        //values are salary
        //keys are name ::
        map1.put("aish", 2000);
        map1.put("kiran", 500);
        map1.put("radhesham", 4000);
        map1.put("jyoti", 10000);
        map1.put("raghuram", 20000);
        map1.put("ashif", 15000);

        Map.Entry<String, Integer> stringIntegerEntry =  getNthHighestSalary(map1);
        System.out.println(stringIntegerEntry);
        System.out.println("======================");

        Map.Entry<String, Integer> stringIntegerEntry2 =  getNthHighestSalary(3,map1);
        System.out.println(stringIntegerEntry2);

        System.out.println("++++++++++++++");
        Map<String, Integer> map2 = new HashMap();
        map2.put("aish", 2000);
        map2.put("aish2", 20000);
        map2.put("kiran", 500);
        map2.put("radhesham", 4000);
        map2.put("radhesham2", 4000);
        map2.put("jyoti", 10000);
        map2.put("raghuram", 20000);
        map2.put("raghuram2", 20000);
        map2.put("ashif", 15000);
         getNthHighestSalarywithDuplicateSal(4, map2);



    }

    private static void getNthHighestSalarywithDuplicateSal(int i, Map<String, Integer> map2) {

        //group the things and print
        Map.Entry<Integer, List<String>> integerListEntry = map2.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.
                        mapping(Map.Entry::getKey, Collectors.toList())))
                //convert the list again into the stream
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).
                        collect(Collectors.toList()).get(i - 1);
        System.out.println(integerListEntry);
        //sort
        //compare
        //get



    }

    //for any type of input
    private static Map.Entry<String, Integer> getNthHighestSalary(int i, Map<String, Integer> map1) {
        return map1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
                collect(Collectors.toList()).get(i-1);
    }


    //this will give second highest salary!!
    private static Map.Entry<String, Integer> getNthHighestSalary(Map<String, Integer> map) {
        
        //sort
      return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                //get into the list
                .collect(Collectors.toList()).get(1);

    }
    //now third scenario



}

