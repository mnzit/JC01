package com.ggic.jb01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Shared Resource
        Resource resource = new Resource();

        System.out.println("Before Multithreading in Resource: " + resource.getValue());

        List<Thread> incrementers = createIncrementers(100, resource);
        List<Thread> decrementers = createDecrementers(100, resource);

        List<Thread> processors = new ArrayList<>();
        processors.addAll(incrementers);
        processors.addAll(decrementers);

        Collections.shuffle(processors);

        processors.parallelStream().forEach(Thread::start);
        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
        }
        System.out.println("After Multithreading in Resource: " + resource.getValue());
    }

    public static List<Thread> createIncrementers(int count, Resource resource) {
        List<Thread> incrementers = new ArrayList<>();
        for (int j = 1; j <= count; j++) {
            Thread incrementor = new Thread(new ResourceProcessorWrapper(r -> {
                for (int i = 1; i <= 10; i++) {
                    r.increment();
                }
            }, resource), "[INCREMENTOR]-" + j);
            incrementers.add(incrementor);
        }
        return incrementers;
    }

    public static List<Thread> createDecrementers(int count, Resource resource) {
        List<Thread> decrementers = new ArrayList<>();
        for (int j = 1; j <= count; j++) {
            Thread incrementor = new Thread(new ResourceProcessorWrapper(r -> {
                for (int i = 1; i <= 10; i++) {
                    r.decrement();
                }
            }, resource), "[DECREMENTER]-" + j);
            decrementers.add(incrementor);
        }
        return decrementers;
    }
}