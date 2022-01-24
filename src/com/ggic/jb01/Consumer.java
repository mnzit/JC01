package com.ggic.jb01;

import java.util.stream.IntStream;

public class Consumer implements Runnable{

    private final Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() { //async
        IntStream.range(1,100).forEach((value) -> resource.consume());
    }
}
