package com.consistancy;

import java.util.*;

public class FirstOccurrencesRepeatedCharacter {

    public static void main(String[] args) {

        String input = "welcome to practice lab";

        //given input stream
        List<String> list = Arrays.asList("java","springBoot","restapi","sql","angular");
        list.stream().map(x->x.toUpperCase()).filter(x->x.length()>=5).forEach(x-> System.out.println(x));
        System.out.println("==============================");



        //To  maintain the insertion order use  the linked HashMap
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        //iterate the string store into the map
        for (int i = 0; i < input.length(); i++) {

            if (map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i), 1);
            }

        }
        System.out.println(map);

        //iterate the  map

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()>1)
            {
                System.out.println(" first repeated character "+entry.getKey());
               // break;
            }
        }

    }
}
