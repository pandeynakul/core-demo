import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//program for sorting the array in Ascending order !!
public class FindTheLargestNumberUsingTheStream {

    public static void main(String[] args) {

        System.out.println("Natural sorting order !! with predefined method");
        int number[] = {5, 9, 11, 28, 21, 1};
        //passing the arrays to the list stream
        List<Integer> collect = Arrays.stream(number).boxed().sorted().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("=========================");

        System.out.println("without predefined method!!Applying the brute force");
        System.out.println("Descending Order !!");
        int[] intArray = new int[]{52, 45, 32, 64, 12, 87, 78, 98, 23, 7};

        int temp = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                //provide the condition
                if (intArray[j] > intArray[i]) {
                    //swap the number
                    temp = intArray[j];
                    intArray[j] = intArray[i];
                    intArray[i] = temp;
                }

            }

        }
        //print thE Array::
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("largest element in the array ::" + intArray[0]);

        System.out.println("******with sort method !Ascending !!**************");
        int [] sortArray = new int [] {52,45,32,64,12,87,78,98,23,7};
        Arrays.sort(sortArray);
        System.out.println(Arrays.toString(sortArray));

    }
}
