package com.ggic.jb01;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new Worker(i), "[worker-" + i + "]");
            System.out.println("Thread name: worker-" + i + " created at: " + new Date().getTime());
            thread.start();
        }
    }

}
