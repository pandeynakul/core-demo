package com.app.congni.interview;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

//with the help of execute() or forkJoin::

public class ApprotchThirdPrintEO {

    //create the object class method

   static Object lock = new Object();


    /*
    perform the condition with the help of filter
    create the separate condition for both odd and even with IntPredicates
    */


    //create IntPredicates
    private static IntPredicate evenCondtion = e -> e % 2 == 0;
    private static IntPredicate oddCondtion = e -> e % 2 != 0;

    //create the separate method for printing the result
    //Based on the condition it will execute the result
    private static void printResult(IntPredicate condtion) {
        IntStream.rangeClosed(1, 10).filter(condtion).forEach(ApprotchThirdPrintEO::execute);
    }

    private static void execute(int i) {
        synchronized (lock){
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                lock.notify();
                lock.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

    //
    public static void execute() {

    }

    public static void main(String[] args) {

        CompletableFuture.runAsync(() -> ApprotchThirdPrintEO.printResult(oddCondtion));
        CompletableFuture.runAsync(() -> ApprotchThirdPrintEO.printResult(evenCondtion));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
