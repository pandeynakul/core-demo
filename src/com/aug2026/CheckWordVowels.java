package com.aug2026;

/* author :  Ankul Deshpande */

import java.util.Arrays;

public class CheckWordVowels {
    public static void main(String[] args) {

        String sentence = "i java Expert near about ten years of Experience";

        Arrays.stream(sentence.split(" ")).
                filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2).
                forEach(x -> System.out.print(x+" "));
    }
}
