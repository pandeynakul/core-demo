import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UpperCaseIssueEx {

    public static void main(String[] args) {
        List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "India", "Canada");
        countries.stream().map(x -> x.toUpperCase()).forEach(System.out::println);

        System.out.println("============perform the summation===============");
        List<Integer> summation = Arrays.asList(10, 20, 30, 40, 50);
        Integer withReduceCal = summation.stream().reduce(0, Integer::sum);
        System.out.println(withReduceCal);
        System.out.println("*=====with the help of map=====*");

        //for performing the transformation::
        List<Integer> transformation = summation.stream().map(x -> x + withReduceCal).collect(Collectors.toList());
        System.out.println(transformation);
        System.out.println("=============================================");

        System.out.println("find the odd and even ::");
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        //collected everything first

        Set<Map.Entry<Boolean, List<Integer>>>  entries= collect.entrySet();

        for(Map.Entry<Boolean, List<Integer>> entry: entries){

            if(entry.getKey()){
                System.out.println("Even Number ::");
            }
            else
            {
                System.out.println("odd Number ::");
            }

            List<Integer> values=entry.getValue();
            for(Integer i:values){
                System.out.println(i);
            }
        }
        //iterate the elements in both the case


    }
}
