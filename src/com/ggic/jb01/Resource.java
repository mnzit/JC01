package com.ggic.jb01;

public class Resource {

    private Integer value;
    private final Object lock = new Object();

    public void increment() {
        synchronized (lock) {
            value++;
        }
    }

    public void decrement() {
        synchronized (lock) {
            value--;
        }
    }
}
