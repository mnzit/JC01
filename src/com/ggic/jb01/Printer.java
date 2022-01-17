package com.ggic.jb01;

public class Printer implements Runnable{
    @Override
    public void run() {
        System.out.println("Printer thread: "+ Thread.currentThread().getName());
        print();
    }

    public void print(){
        System.out.println("Printing some stuff!!");
    }
}
