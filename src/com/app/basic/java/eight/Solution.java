package com.app.basic.java.eight;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrCount = Integer.parseInt(sc.nextLine().trim());
        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            return sc.nextLine().replaceAll("\\s+$", "");
        }).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());

        int lowCount = Integer.parseInt(sc.nextLine().trim());


       int result = Result.moves(arr);
        System.out.println(result);
    }
}
