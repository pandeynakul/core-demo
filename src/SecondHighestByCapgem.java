import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestByCapgem {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(2);
        list.add(15);
        list.add(20);
        list.add(25);

        //create the function which return the integer
        Integer result = findSecondHighestInteger(list);
        System.out.println("IInd Highest Integer:: " + result);
        System.out.println("=======================================");
        List<String> list1= Arrays.asList("I","Ankul","IAishwarya","logical","Ilov","Iloveu","Isanj","Ilu");
        long count = list1.stream().filter(s -> s.length() > 5).count();
        System.out.println(count);
         list1.stream().filter(s -> s.length() > 5).collect(Collectors.toList()).forEach(System.out::println);




    }

    private static Integer findSecondHighestInteger(ArrayList<Integer> list) {
        //base case number should contain the at lest two number
        if (list == null || list.size() < 2) {
            return null;
        }
        else{
            //perform the operation
            Collections.sort(list,Collections.reverseOrder());
            return list.get(1);
        }

    }
}
