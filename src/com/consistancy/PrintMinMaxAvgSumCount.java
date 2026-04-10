package com.consistancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class PrintMinMaxAvgSumCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50,23);
        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        double avg=list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        int sum=list.stream().mapToInt(Integer::intValue).sum();
        long count = list.stream().count();
        System.out.println(max+" "+min+" "+avg+" "+sum+" "+count);

        //with the help of summary statistics
        System.out.println("with summary statistics");
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(Integer::intValue).summaryStatistics();
        int max1 = intSummaryStatistics.getMax();
        int min1 =intSummaryStatistics.getMin();
        double avg1=intSummaryStatistics.getAverage();
        long sum1 =intSummaryStatistics.getSum();
        long count1 = intSummaryStatistics.getCount();
        System.out.println(max1+" "+min1+" "+avg1+" "+sum1+" "+count1);

        //check whether number is present or not
        int numberToMatch=10;
        boolean anyMatch = list.stream().anyMatch(x -> x == numberToMatch);
        if(anyMatch){
            System.out.println("+nt");
        }
        else {
            System.out.println("not pressnt");
        }
        //check whether number is divisible by Given number
        boolean allMAtchNum = list.stream().allMatch(x -> x % numberToMatch == 0);
        if(allMAtchNum){
            System.out.println("divisible");
        }
        else {
            System.out.println("not divisible");
        }
        System.out.println("just  printing the nubers ");
        //printing the number which are divisible
        list.stream().filter(x -> x % numberToMatch == 0).forEach(x-> System.out.println(x));

    }
}
