package com.app.congni.interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseNumber {
    public static void main(String[] args) {

        //method::1
        int number = 1234;
        /*int reverse = 0;

        while (number != 0) {

            //perform the operation
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;

        }
        System.out.println(reverse);*/

        //Method:: 2
        /*int reverse2;
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        reverse2=Integer.valueOf(sb.reverse().toString());
        System.out.println(reverse2);*/

        String reverseNumber = Stream.of(String.valueOf(number).split(" ")).
                map(w -> new StringBuilder(w).reverse().toString()).collect(Collectors.joining());
        System.out.println(reverseNumber);


    }
}
