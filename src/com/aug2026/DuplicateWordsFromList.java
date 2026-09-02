package com.aug2026;

/* author :  Ankul Deshpande */


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsFromList {

    public static void main(String[] args) {
        String sentence = "i java Expert near about ten java years of Experience";
        //words
        List<String> collect = Arrays.stream(sentence.split(" ")).collect(Collectors.toList());
        System.out.println(collect);

        removeDuplicateWord(collect);

        List<String> duplicateChar = collect.stream().
                filter(w -> hasDuplicateHandler(w)).collect(Collectors.toList());
        System.out.println(duplicateChar);

    }

    //remove duplicate and print:
    private static void removeDuplicateWord(List<String> words) {
        Map<String, Long> counts = words.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> duplicateWords = counts.entrySet().stream().filter(v -> v.getValue() > 1)
                .map(x -> x.getKey()).collect(Collectors.toList());
        System.out.println(duplicateWords);

    }

    //which contain duplicate character in the word of sentene
    private static boolean hasDuplicateHandler(String w) {
        //💡 Think of w.chars() as saying:
        //"Give me the raw numeric identity of each character in this string,
        // so I can process them in a stream-like way.
        return w.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() != w.length();
    }
}
