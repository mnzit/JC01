package com.ggic.jb01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    // Ctrl+Alt+L format code
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("linkedlist: "+estimatedTime);
        startTime = System.nanoTime();
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("arraylist: "+estimatedTime);

    }
}