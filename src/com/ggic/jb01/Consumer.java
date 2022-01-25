package com.ggic.jb01;

import java.util.List;

public class Consumer implements Runnable {

    private final List<Integer> taskContainer;

    public Consumer(List<Integer> taskContainer) {
        this.taskContainer = taskContainer;
    }

    @Override
    public void run() {
        while (true) {
            consume();
        }
    }

    private void consume() {
        synchronized (taskContainer) {
            while (taskContainer.isEmpty()) {
                try {
                    System.out.println("Container is empty: " + Thread.currentThread().getName() + " size: " + taskContainer.size());
                    // consumer is waiting for producer to notify to start consuming
                    taskContainer.wait();
                } catch (Exception ex) {
                }
            }

            try {
//                Thread.sleep(1000);
                int i = taskContainer.remove(taskContainer.size() - 1);
                System.out.println("consumed: " + i);
            } catch (Exception ex) {

            }
            taskContainer.notifyAll();
        }
    }
}
