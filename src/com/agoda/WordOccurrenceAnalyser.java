package com.agoda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class WordOccurrenceAnalyser {

    private static final String FOLDER_PATH = "C:\\Users\\ankul\\OneDrive\\Desktop\\readFileFolder";
    //create an hashMap

    Map<String, Long> wordMap = new HashMap();


    public List<String> findNthOccurance(int rank, boolean highest) throws IOException {

        //perform with executor service

        //get the files
        List<Path> files = Files.walk(Paths.get(FOLDER_PATH)).filter(Files::isRegularFile)
                .collect(Collectors.toList());
        System.out.println("===============part 1=================");
        //read all the files from the folder
        //iterate
        for (Path file : files) {
            Files.lines(file).flatMap(line -> Arrays.stream(line.split("\\W+")))
                    .filter(word -> !word.isEmpty())
                    .forEach(word -> {
                        wordMap.merge(word, 1L, Long::sum);
                        System.out.println(Thread.currentThread().getName());
                    });
        }

            System.out.println(wordMap);
            System.out.println("===============part 2=====================");
            //handle ranking grouping word by their frequency ::
            //group word by occurance
            Map<Long, List<String>> frequencyWord = wordMap.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                    Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
            System.out.println(frequencyWord);

            System.out.println("===============part 3=====================");
            //sort the frequency based on the user search (asc/desc)


            List<Long> sortedFrequency = new ArrayList<>(frequencyWord.keySet());
            sortedFrequency.sort(highest ? Comparator.reverseOrder() : Comparator.naturalOrder());
            System.out.println(sortedFrequency);
            System.out.println("===============part 4=====================");
            //validation of rank::

            if (rank <= 0 || rank > sortedFrequency.size()) {
                throw new IllegalArgumentException("rank is not valid !!");
            }

            //get the frequency of the targeted rank
            long targetedRank = sortedFrequency.get(rank - 1);

            return frequencyWord.getOrDefault(targetedRank, Collections.emptyList());
        }


        public static void main (String[] args) throws Exception {
            WordOccurrenceAnalyser wordOccurrenceAnalyser = new WordOccurrenceAnalyser();
            System.out.println(wordOccurrenceAnalyser.findNthOccurance(4, true));
            System.out.println(wordOccurrenceAnalyser.findNthOccurance(1, false));

        }


}
