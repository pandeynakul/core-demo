package com.consistancy;

import java.util.*;

//sort the  map  by its value
public class SortTheMapCoforge {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();

        map.put("Aapple", 30);
        map.put("banana", 15);
        map.put("Orange", 20);
        map.put("Mango", 10);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        //do it ascending order
        // list.sort(Map.Entry.comparingByValue());

        //do it descending order
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        //maintain the insertion order use the linked map
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap();
        //add elements to the linked map
        for (Map.Entry<String, Integer> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());

        }
        //sorted by value
        System.out.println("sorted map in  order" + linkedHashMap);


    }
}
