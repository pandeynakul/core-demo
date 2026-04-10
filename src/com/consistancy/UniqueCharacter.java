package com.consistancy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find the unique character from the string
public class UniqueCharacter {
    public static void main(String[] args) {

        //find the unique character from the string
        String input = "welcomec";
        String uniqueCharacter = input.chars().mapToObj(c -> (char) c).collect(Collectors.
                groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).
                        map(String::valueOf).collect(Collectors.joining());
        System.out.println(uniqueCharacter);

        //convert the first character into the uppercase
        String input1 = "welcome to java stream";
        String uppercaseFirst = Arrays.stream(input1.split(" ")).map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).
                collect(Collectors.joining(" "));
        System.out.println(uppercaseFirst);


        List<String> list = Arrays.asList("apple", "banana", "cherry", "coconut");
        //print the lenth of the string
        //list.stream().map(word->word +" "+ word.length()).forEach((x)-> System.out.println(x));

        //length wise grouping of string

        Map<Integer, List<String>> mapMollect = list.stream().collect(Collectors.groupingBy(String::length));
        //iterate the map
        mapMollect.forEach((x, y) -> System.out.println(x + " " + y));


        String input2 = "mahendra";
        List<Map.Entry<Character, Long>> output = input2.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toList());
        System.out.println(output);


        //"hi here we are"
        //find the most repetitive char
        //output : shhould be e ok
        String input3 = "hi here we are";

        Character key = input3.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(key);
    }


}
