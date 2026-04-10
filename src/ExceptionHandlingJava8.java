import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExceptionHandlingJava8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("44", "373", "xyz");
        /*List<Integer> intList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(intList);*/

        //list.stream().forEach(x-> System.out.println(Integer.parseInt(x)));

        //handling Exception into the imperative way!!
        //not an recommended way
        //pipeline
        /*list.forEach(x -> {
            try {
                System.out.println(Integer.parseInt(x));

            } catch (Exception ex) {
                System.out.println("exception :: " + ex.getMessage());
            }
        });*/

      //Alternative way!!
        //Approtch 2
        list.forEach(ExceptionHandlingJava8::printList);
        System.out.println("=============**================");
        //Approtch 3
        list.forEach(handleExceptionIfAny(x-> System.out.println(Integer.parseInt(x))));
        System.out.println("==================================XX");
        //Approtch 4
        list.forEach(handleExceptionGenericWay(x-> System.out.println(Integer.parseInt(x)),
                NumberFormatException.class));
        System.out.println("=========================XX");
        List<Integer> list1=Arrays.asList(1,0);
        list1.forEach(handleExceptionGenericWay(x-> System.out.println(10/x),
                ArithmeticException.class));
        System.out.println("=========================XX");
        //handleException For Checked 1
        //InterruptedException
        List<Integer> list2=Arrays.asList(10,20);
        list2.forEach(handleCheckedExceptionConsumer(i->{
            Thread.sleep(i);
            System.out.println(i);
        }));
    }

    //Approtch :  2
    public static void printList(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (Exception ex) {
            System.out.println("exception :: " + ex.getMessage());
        }
    }

    //another way!!==============Approtch 3
    static Consumer<String> handleExceptionIfAny(Consumer<String> payload){
        return  obj->{
            try {
                payload.accept(obj);
            } catch (Exception ex) {
                System.out.println("exception :: "+ex.getMessage());
            }
        };
    }
    //Method 4 more Generic

    static<Target,ExObj extends Exception> Consumer<Target> handleExceptionGenericWay
            (Consumer<Target> targetConsumer,Class<ExObj> exObjClass){

        return obj->{
            try {
                targetConsumer.accept(obj);
            } catch (Exception ex) {
                try {
                    ExObj exObj = exObjClass.cast(ex);
                    System.out.println("exception :: " + exObj.getMessage());
                } catch (ClassCastException exc){
                    throw exc;
                }
            }

        };
    }

    static <Target>Consumer<Target> handleCheckedExceptionConsumer(CheckedExceptionHnadlerConsumer<Target,
            Exception> handler){
        return obj->{
            try {
                handler.accept(obj);
            } catch (Exception ex) {
                //System.out.println("Exception :: "+ex.getMessage());
              throw  new RuntimeException();

            }
        };
    }
}
