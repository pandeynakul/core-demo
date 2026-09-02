package com.aug2026;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//intersection of two list
public class IntersectionOfList {

    public static void main(String[] args) {
        System.out.println("intersection- common from both list");
        List<String> list1 = Arrays.asList("docker", "r++", "k8ns", "python");
        List<String> list2 = Arrays.asList("c++", "docker", "java", "python");

        List<String> list3 = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(list3);

        //containing only vowels:
        System.out.println("separate->containing only vowels ");
        List<String> words = Arrays.asList("oo", "r++", "k8ns", "ii");
        List<String> onlyVowels = words.stream().
                filter(w -> w.matches("[AEIOUaeaiou]+")).collect(Collectors.toList());
        System.out.println(onlyVowels.stream().collect(Collectors.joining(", ")));

        System.out.println("comma separate theString -> ");
        List<String> list4 = Arrays.asList("oo", "r++", "k8ns", "ii");
        String commaSeparate = list4.stream().collect(Collectors.joining(", "));
        System.out.println(commaSeparate);
    }


}
