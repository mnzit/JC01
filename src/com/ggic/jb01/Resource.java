package com.ggic.jb01;

public class Resource {

    private Integer value = 1;
    private Object object = new Object();

    public Resource(Integer value) {
        this.value = value;
    }

    // incrementor
    public void produce() {
        // Lock the object
        synchronized (object) {
            System.out.println(object + " is locked by " + Thread.currentThread().getName()+ " value: "+ value);
            value++; // value = value - 1; // Read -> Write
            System.out.println(object + " is going to be unlocked by " + Thread.currentThread().getName()+ " value: "+ value);
        }
        // unlock the object
    }

    // decrementor
    public void consume() {
        // Lock the object
        synchronized (object) {
            System.out.println(object + " is locked by " + Thread.currentThread().getName()+ " value: "+ value);
            value--; // value = value + 1; // Read -> Write
            System.out.println(object + " is going to be unlocked by " + Thread.currentThread().getName()+ " value: "+ value);
        }
        // unlock the object
    }

    @Override
    public String toString() {
        return "Resource{" +
                "value=" + value +
                '}';
    }
}
