package com.ggic.jb01;

public class Resource {

    private Integer value = 1;
    private final Object lock = new Object();

    public void increment() {

        /**
         * This synchronized is locking based in the lock instance, so when the lock object is locked by one thread other thread cannot lock it until this thread finishes its work
         */
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " before incrementing = " + value);
            value++;
            System.out.println(Thread.currentThread().getName() + " after incrementing = " + value);
        }
    }

    public void decrement() {
        /**
         * This synchronized is locking based in the lock instance, so when the lock object is locked by one thread other thread cannot lock it until this thread finishes its work
         */
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " before decrementing = " + value);
            value--;
            System.out.println(Thread.currentThread().getName() + " after decrementing = " + value);
        }
    }

    public Integer getValue() {
        return value;
    }
}
