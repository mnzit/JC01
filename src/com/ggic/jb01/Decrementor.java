package com.ggic.jb01;

public class Decrementor implements Runnable {

    private final Resource resource;

    public Decrementor(Resource resource) {
        this.resource = resource;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            resource.decrement();
        }
    }
}
