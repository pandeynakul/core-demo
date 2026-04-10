import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigit {

    public static void main(String[] args) {

        int i = 15623;
        System.out.println(Stream.of(String.valueOf(i).split("")).
               collect(Collectors.summarizingInt(Integer::parseInt)));
        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).
                collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfDigits);



    }
}
