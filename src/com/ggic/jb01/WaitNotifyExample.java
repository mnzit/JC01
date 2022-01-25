package com.ggic.jb01;

import java.util.ArrayList;
import java.util.List;

public class WaitNotifyExample {

    public static void main(String[] args) {

        List<Integer> taskContainer = new ArrayList<>();
        int maxCapacity = 5;
        Thread producer = new Thread(new Producer(taskContainer, maxCapacity), "producer");
        Thread consumer = new Thread(new Consumer(taskContainer), "consumer");
        producer.start();
        consumer.start();

    }
}
