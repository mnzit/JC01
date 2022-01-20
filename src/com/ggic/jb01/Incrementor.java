package com.ggic.jb01;

public class Incrementor implements Runnable {

    private final Resource resource;

    public Incrementor(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            resource.increment();
        }
    }
}
