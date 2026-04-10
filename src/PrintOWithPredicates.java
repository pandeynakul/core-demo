import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrintOWithPredicates {

    //class lavel gloabl lavel
    //define two predicates and print result
    private static IntPredicate evenCondition = e -> e % 2 == 0;
    private static IntPredicate oddCondition = e -> e % 2 != 0;
    //define the object to pass
    private static Object object = new Object();

    //client
    public static void main(String[] args) throws InterruptedException {

        //call the print result with the help of completable feature
        CompletableFuture.runAsync(()->PrintOWithPredicates.printResult(oddCondition));
        CompletableFuture.runAsync(()->PrintOWithPredicates.printResult(evenCondition));
        Thread.sleep(10000);


    }


    public static void printResult(IntPredicate condition) {
        //define to two predicates for even and odd
        IntStream.rangeClosed(1, 10).filter(condition).forEach(PrintOWithPredicates::execute);
    }

    //have the execute method
    public static void execute(int i) {

        synchronized (object) {

            try {
                System.out.println("Thread_name " + Thread.currentThread().getName() + ": " + i);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
