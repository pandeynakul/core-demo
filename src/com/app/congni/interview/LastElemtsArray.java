package com.app.congni.interview;

import java.util.Arrays;
import java.util.stream.Stream;

public class LastElemtsArray {

    //Technical with hcl
    public static void main(String[] args) {

        Integer arr[]=new Integer[]{1,2,3,4,5,6,7,8,9};

        Arrays.asList(arr).stream().skip(arr.length-1).forEach(System.out::println);
        Stream.of(arr).skip(arr.length-1).forEach(System.out::println);

        String sarr[]=new String[]{"hi","hellow","chalo"};
        Arrays.asList(sarr).stream().skip(sarr.length-1).forEach(System.out::println);
    }
}
