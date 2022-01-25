package com.ggic.jb01;

import java.util.concurrent.atomic.AtomicInteger;

public class Resource {

    private volatile AtomicInteger value;
    private Object object = new Object();

    public Resource(AtomicInteger value) {
        this.value = value;
    }

    // incrementor
    public void produce() {
        // Lock the object
//        synchronized (object) {
//        System.out.println(object + " is locked by " + Thread.currentThread().getName() + " value: " + value);
        value.getAndIncrement();// value = value - 1; // Read -> Write
//        System.out.println(object + " is going to be unlocked by " + Thread.currentThread().getName() + " value: " + value);
//        }
        // unlock the object
    }

    // decrementor
    public void consume() {
        // Lock the object
//        synchronized (object) {
//        System.out.println(object + " is locked by " + Thread.currentThread().getName() + " value: " + value);
        value.getAndDecrement(); // value = value + 1; // Read -> Write
//        System.out.println(object + " is going to be unlocked by " + Thread.currentThread().getName() + " value: " + value);
//        }
        // unlock the object
    }

    @Override
    public String toString() {
        return "Resource{" +
                "value=" + value +
                '}';
    }
}
