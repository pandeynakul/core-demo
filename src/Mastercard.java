import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Mastercard {

    //printing the random number

    public static void main(String[] args) {
        Random random
                = new Random();
        random.ints(1, 100).limit(100).sorted().forEach(System.out::println);
        //find the largest elemnt in array
        int arr[] = new int[]{19, 22, 23, 14, 50, 46};

        findTheLargestElementsInArray(arr);
    }

    //print the largest element in array
    //sorting a program is very basic in the programming word
    private static void findTheLargestElementsInArray(int[] arr) {
        Arrays.sort(arr);
        //accessing the elements in array
        int largestElement=arr[arr.length-1];
        System.out.println("largest Elements in Array :: "+ largestElement);
        System.out.println("===============");
       // Stream.of(arr).sorted().findFirst().get();

    }
    //providing alternative option
}
