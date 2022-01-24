package com.ggic.jb01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        Optional<Integer> optionalSum = numbers
                .stream()
                .reduce((a, b) -> {
                    System.out.println("a:"+a);
                    System.out.println("b:"+b);
                    Integer currentTotal = a + b;
                    System.out.println("total:"+currentTotal);
                    return currentTotal; // O
                });
//                .reduce(Integer::sum);
//
//        if (optionalSum.isPresent()) {
//            System.out.println(optionalSum.get());
//        }
//

    }

    public void print(Integer i) {
        System.out.println(i);
    }
}
