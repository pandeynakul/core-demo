package com.app.congni.interview;

//very important
//multithreading and interThreadCommunication thread concept
//with java7 or without java 8


public class PrintEvenOrOddThread implements Runnable {

    //start the counting from 1
    public static int count = 1;
    //create the object to perform the locking
    Object object ;
    //initialize the with the help of constructor
    public  PrintEvenOrOddThread( Object object){
        this.object=object;
    }

    @Override
    public void run() {
        while (count <= 10) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                 //perform the locking
                synchronized (object){
                System.out.println("Even: " + count);
                count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

            if (count % 2 == 1 && Thread.currentThread().getName().equals("odd")) {
                //pperform the synchronization
                synchronized (object) {
                    //print the count
                    System.out.println(Thread.currentThread().getName()+ ": " + count);
                    count++;
                    object.notify();
                }

            }

        }

    }


    public static void main(String[] args) {
        Object lock=new Object();

        //create the thread
        Runnable r1=new PrintEvenOrOddThread(lock);
        Runnable r2=new PrintEvenOrOddThread(lock);

        new Thread(r1,"even").start();
        new Thread(r2,"odd").start();

    }


}
