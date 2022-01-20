package com.ggic.jb01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // Shared Resource
        Resource resource = new Resource();

        List<Thread> incrementers = createIncrementers(1000, resource);
        List<Thread> decrementers = createDecrementers(1000, resource);

        List<Thread> processors = new ArrayList<>();
        processors.addAll(incrementers);
        processors.addAll(decrementers);

        Collections.shuffle(processors);

        processors
                .parallelStream()
                .forEach(Thread::start);
    }

    public static List<Thread> createIncrementers(int count, Resource resource) {
        Runnable incrementTask = new ResourceProcessorWrapper(r -> IntStream.range(1, count).forEach(i -> r.increment()), resource);
        return IntStream
                .range(1, count)
                .mapToObj((i) -> new Thread(incrementTask, "[INCREMENTER]-" + i))
                .collect(Collectors.toList());
    }

    public static List<Thread> createDecrementers(int count, Resource resource) {
        Runnable decrementTask = new ResourceProcessorWrapper(r -> IntStream.range(1, count).forEach(i -> r.decrement()), resource);
        return IntStream
                .range(1, count)
                .mapToObj((i) -> new Thread(decrementTask, "[DECREMENTER]-" + i))
                .collect(Collectors.toList());
    }
}