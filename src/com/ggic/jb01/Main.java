package com.ggic.jb01;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // target
        Resource resource = new Resource(1); // synchronous

        System.out.println(resource); // 1 // sync

        List<Thread> producers = IntStream.range(1, 100).mapToObj((i) -> new Thread(() -> resource.produce(), "[producer-" + i + "]")).collect(Collectors.toList());
        List<Thread> consumers = IntStream.range(1, 100).mapToObj((i) -> new Thread(() -> resource.consume(), "[consumer-" + i + "]")).collect(Collectors.toList());

        producers
                .parallelStream()
                .forEach(Thread::start);

        consumers
                .parallelStream()
                .forEach(Thread::start);

        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
            System.out.println("Ex: " + ex.getMessage());
        }


        System.out.println(resource); // 1 // sync

        // Incrementor Thread Read: 1
        // Decrementor Thread Read: 1
        // Decrementor Thread Write: 1-1 = 0
        // Incrementor Thread Write: 1+1 = 2
    }
}