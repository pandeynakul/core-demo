import java.util.EnumMap;
import java.util.Enumeration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class EAndOPrintByExecutiveService8 {

    //created executor service

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //completable feature for odd
        IntStream.range(1, 10).forEach(num -> {
            CompletableFuture<Integer> oddCompletableFeature = CompletableFuture.completedFuture(num).
                    thenApplyAsync(x -> {
                        if (x % 2 != 0) {
                            System.out.println("Thread name " + Thread.currentThread().getName() + ": " + x);
                        }
                        return num;
                    }, executorService);
            oddCompletableFeature.join();

        //Completable feature for Even
        CompletableFuture<Integer> evenCompletableFeature = CompletableFuture.completedFuture(num).
                thenApplyAsync(x->{
                    if(x%2==0){
                        System.out.println("Thread name "+Thread.currentThread().getName()+ " : "+x);
                    }
                return num;
                },executorService);
        evenCompletableFeature.join();
        });
        executorService.shutdown();


    }
}
