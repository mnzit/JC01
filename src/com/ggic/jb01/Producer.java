package com.ggic.jb01;

import java.util.List;

public class Producer implements Runnable {

    private final List<Integer> taskContainer;
    private final int maxCapacity;

    public Producer(List<Integer> taskContainer, int maxCapacity) {
        this.taskContainer = taskContainer;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void run() {
        int counter = 1;
        while (true) {
            produce(counter++);
        }
    }

    private void produce(int i) {
        synchronized (taskContainer) {
            while (taskContainer.size() == maxCapacity) {
                try {
                    // producer is waiting for consumer to notify to start producing
                    System.out.println("Container is full: " + Thread.currentThread().getName() + " size: " + taskContainer.size());
                    taskContainer.wait();
                } catch (Exception ex) {
                }
            }

            try {
//                Thread.sleep(1000);
                taskContainer.add(i);
                System.out.println("produced: " + i);
            } catch (Exception ex) {

            }
            taskContainer.notifyAll();
        }
    }
}
