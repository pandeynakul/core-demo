package com.thread;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

//multiple feature can  not be chained together
//we cant force fully complete the execution of the feature or ExecutorService
//u cant combine the multiple feature and proper Exception handle
public class AsyncProgramming {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Alt_shift+enter
        //ctl+alt+shif+l=formate
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future = executorService.submit(() -> {
            return Arrays.asList(1, 2, 3, 4);
        });
        //return the feature object
        List<Integer> list = future.get();
        System.out.println(list);
        //runAsync(runnable)
        //supplyAsync(supplier)
        CompletableFuture completableFuture=new CompletableFuture();
        completableFuture.get();
        completableFuture.complete("completed");

    }
}
