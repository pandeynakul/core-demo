package com.consistancy;

import java.util.stream.IntStream;

//print 1 to 10 without for loop
public class RecursionExample {
    public static void main(String[] args) {
        //without for loop
       // IntStream.rangeClosed(1,10).forEach(x-> System.out.println(x));

        //With the help of recursion::
        printNumber(1);
    }

    public static void printNumber(int n) {
        if(n>10){
           return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
}
