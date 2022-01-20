package com.ggic.jb01;

public class Main {

    public static void main(String[] args) {
//        Resource resource = new Resource();
//        final Thread incThread = new Thread(() -> {
//            resource.increment();
//        });
//
//        final Thread decThread = new Thread(() -> {
//            resource.decrement();
//        });
//
//        incThread.start();
//        decThread.start();
//
//        try {
//            incThread.join();
//            decThread.join();
//            System.out.println(resource.getValue());
//        }catch (Exception ex){
//
//        }

        System.out.println("Program has started");
        Thread thread1 = new Thread(() -> {
            System.out.println("The Thread1 is printing something");
            try {
            Thread.sleep(1000);
            }catch (Exception ex){}
        });
        Thread thread2 = new Thread(() -> System.out.println("The Thread2 is printing something"));
        Thread thread3 = new Thread(() -> System.out.println("The Thread3 is printing something"));

        // run -> sync
        // start -> async

        thread1.run();
        thread2.run();
        thread3.run();
        //                                         -> terminated
        //                                         -> blocked
        // main thread new -> runnable -> running  -> waiting -> starvation
        try {
//            thread1.join(); // main waiting
//            thread2.join();
//            thread3.join();
        }catch (Exception ex){}
        System.out.println("Program has ended");
    }
}