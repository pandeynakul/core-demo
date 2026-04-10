import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LastElementOfArray {
    public static void main(String[] args) {
        List<String> listOfStrings =Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
       // listOfStrings.stream().skip(listOfStrings.size()-1).forEach(x-> System.out.println(x));
        String lastElement = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(lastElement);

        //Find the age of a person in years if the birthday has given?

        LocalDate birthday=LocalDate.of(1990, 07, 8);
        LocalDate today=LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthday,today));
        System.out.println("=============first 10 odd number !!===============");
        Stream.iterate(new int[]{1,3}, x->new int[]{x[1],x[1]+2}).limit(10).map(x->x[0]).
                forEach(x-> System.out.println(" "+x));

        //Fibonacci series with java 8

    }
}
