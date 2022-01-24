package com.ggic.jb01;

import java.util.stream.IntStream;

public class Producer implements Runnable {

    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() { // async
        IntStream.range(1, 100).forEach((value) -> resource.produce());
    }
}
