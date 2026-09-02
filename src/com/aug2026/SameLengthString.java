package com.aug2026;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.List;

public class SameLengthString {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("ooo", "r++", "k8s", "iio");
        boolean checkSameLength = list1.stream()
                //compare the length of first element with other so
                //will know the length of list of element are same or not
                .allMatch(x -> x.length() == list1.get(0).length());
        System.out.println(checkSameLength);

        //differance between max and min
        List<Integer> ls2 = Arrays.asList(1, 2, 3, 5, 6, 72, 21);
        int max = ls2.stream().mapToInt(x -> (int) x).max().getAsInt();
        int min = ls2.stream().mapToInt(x -> (int) x).min().getAsInt();
        System.out.println(max - min);
    }
}
