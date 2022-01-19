package com.ggic.jb01;

public class Worker implements Runnable{

    public void work(){
        System.out.println("Performing his assigned task");
    }

    @Override
    public void run() {
        work();
    }
}
