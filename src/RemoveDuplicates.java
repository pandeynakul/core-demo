import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<String> listOfDuplicates = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueString = listOfDuplicates.stream().distinct().
                collect(Collectors.toList());
        System.out.println(uniqueString);

        System.out.println("================*Frequenct of the word *====================");

        List<String> input = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> collect = input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        System.out.println("====Frequency of the Character in the statements=====");

        String inputString = "Java Concept Of The Day";
        // List<String> charInput=Arrays.asList(inputString);
        //System.out.println(charInput);
        //charInput.Chars().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Character, Long> collect1 = inputString.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);
        System.out.println("===============**================!!");

        //find the multiple of 5
        List<Integer> listInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("Multiple five::");
        listInteger.stream().filter(i -> i % 5 == 0).forEach(x -> System.out.println(x));

        int max = listInteger.stream().max(Comparator.naturalOrder()).get();
        System.out.println("maximum Number ::" + max);
        int min = listInteger.stream().min(Comparator.naturalOrder()).get();
        System.out.println("minimum Number ::" + min);


        System.out.println("================Print first 10 Number ================!!");
        IntStream.rangeClosed(1, 10).forEach(x -> System.out.print(x + " "));
        //reverse the integer Array::

    }
}
