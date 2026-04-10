package com.app.congni.interview;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumStudentMarkAverage {

    public static void main(String[] args) {
        //double dimension
        String input[][] = {{"Bob", "87"}, {"Mike", "35"}, {"Bob", "52"},
                {"jason", "35"}, {"Mike", "55"}, {"Jessika", "99"}};


        calculateMaxMarkAverage(input);

    }


    //calculateMaxMarkAverage
    private static void calculateMaxMarkAverage(String[][] input) {

        int max = Integer.MIN_VALUE;
        //take the Map
        Map<String, Student> studentMap = new HashMap<>();
        //iterate the array
        for (String[] r : input) {
            // System.out.println(r[0]+" "+r[1]);
            //provide the checks
            if (studentMap.containsKey(input)) {
                //get the r[0]
                Student student = studentMap.get(r[0]);
                //not an first entry
                studentMap.put(r[0], new Student(r[0], student.marks + Integer.parseInt(r[1]), student
                        .count + 1));
                //performing the average logic
                max = student.marks + Integer.parseInt(r[1]) / student.count + 1;


            } else {
                //its an first entry
                studentMap.put(r[0], new Student(r[0], Integer.parseInt(r[1]), 1));
                max = Math.max(Integer.parseInt(r[1]), max);

            }
        }
        System.out.println(max);
    }



}
