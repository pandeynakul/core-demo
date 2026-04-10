import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int arr1[] = {80, 10, 15, 2, 35, 60};
        int arr2[] = {35, 80, 60, 20, 75};
        //find the common element

        printIntersectionOfArray(arr1, arr2);
        printUnion(arr1, arr2);

    }

    private static void printUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet();
        //union without duplicating

        for (int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }

    private static void printIntersectionOfArray(int[] arr1, int[] arr2) {

        Set<Integer> set = new HashSet();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        //iterate second array!!
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                System.out.println(arr2[i] + " ");
            }
        }
    }


}
