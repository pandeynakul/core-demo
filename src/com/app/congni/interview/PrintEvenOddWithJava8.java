package com.app.congni.interview;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PrintEvenOddWithJava8 {

    public static void main(String[] args) {

        //with the help of completable feature
        //with the help of two threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.rangeClosed(1,10).forEach(num->{
            CompletableFuture<Integer> oddcompletableFeature=CompletableFuture.completedFuture(num)
                    .thenApplyAsync(x->{
                        if(x%2!=0){
                            System.out.println(Thread.currentThread().getName()+": "+x);
                        }
                        return num;
                    },executorService);

            oddcompletableFeature.join();

            CompletableFuture<Integer> evencomplefature=CompletableFuture.completedFuture(num).
                    thenApplyAsync(x->{
                        if(x%2==0){
                            System.out.println(Thread.currentThread().getName()+": "+x);
                        }
                        return num;
                    },executorService);
            evencomplefature.join();
        });
        executorService.shutdownNow();




    }
}
