package com.app.congni.interview;

import java.util.*;
import java.util.stream.Collectors;

//Important::
public class NthHighestSalary {
    public static void main(String[] args) {

        //create the map
        Map<String, Integer> map1 = new HashMap();
        map1.put("anil", 1000);
        map1.put("bhavna", 1300);
        map1.put("micol", 1500);
        map1.put("tom", 1600);
        map1.put("ankul", 1200);
        map1.put("denial", 1700);
        map1.put("james", 1400);


        //second highest::
      //  Map.Entry<String, Integer> result = getNthHighestSalary(2, map1);
       // System.out.println(result);


        //Generic way::withDuplicates of the salary
        Map<String, Integer> map2 = new HashMap();
        map2.put("anil", 1000);
        map2.put("bhavna", 1000);
        map2.put("micol", 1600);
        map2.put("tom", 1600);
        map2.put("ankul", 1200);
        map2.put("denial", 1700);
        map2.put("james", 1400);

        getNthHighestSalaryDuplicates(2, map2);


    }

    private static Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
                collect(Collectors.toList()).get(num - 1);
    }

    //more generic
    private static void getNthHighestSalaryDuplicates(int num, Map<String, Integer> map) {

        Map.Entry<Integer, List<String>> integerListEntry = map.entrySet().stream().
                collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))

                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(num - 1);
        System.out.println(integerListEntry);

    }
}