package com.ggic.jb01;

public class Main {

    public static void main(String[] args) {
        // Shared Resource
        Resource resource = new Resource();

        System.out.println("Before Multithreading in Resource: " + resource.getValue());

        Thread incrementor = new Thread(new ResourceProcessorWrapper(r -> {
            for (int i = 1; i <= 10000; i++) {
                r.increment();
            }
        }, resource), "INCREMENTOR");

        Thread decrementer = new Thread(new ResourceProcessorWrapper(r -> {
            for (int i = 1; i <= 10000; i++) {
                r.decrement();
            }
        }, resource), "DECREMENTOR");

        incrementor.start();
        decrementer.start();

        try {
            incrementor.join();
            decrementer.join();
        } catch (Exception ex) {
            System.out.println("Exception : " + ex.getMessage());
        }
        System.out.println("After Multithreading in Resource: " + resource.getValue());
    }
}