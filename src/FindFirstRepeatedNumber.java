
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedNumber {

    /*Given an array, find the first repeating element?

        [1,2,3,4,3,1,2]

        Ans : 3*/
    public static void main(String[] args) {

        //do it from the java8
        System.out.println("with the help of the  java 8");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 2);

        Integer firstReptN = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).findFirst().get();
        System.out.println(firstReptN);

        System.out.println("==Amdocs===without java 8====");


        int[] arr = new int[]{1, 2, 3, 4, 3, 1, 2};

        int min = -1;
        HashSet set = new HashSet();

        //do it brute force
        for (int i = 0; i < arr.length; i++) {
            //check whether number is present or not
            if (set.contains(arr[i])) {
                min = i;
                break;
            } else {
                set.add(arr[i]);
            }
            //check whether number is updated or not

        }
        if (min != -1) {

            //then print the index value
            System.out.println(arr[min]);
        } else {
            System.out.println("not found in Repeated");
        }


    }
}
