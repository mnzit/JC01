package com.ggic.jb01;

import com.ggic.jb01.factory.PlayableFactory;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Person person = Person
                            .create()
                            .name("Aakash")
                            .contactNo("9808546678")
                            .address("KTM");

      System.out.println(person);
    }

    public static void call(){
        Playable playable = PlayableFactory.produceMi("guitar");
        System.out.println(playable);
        if(playable != null){
            playable.play();
        }
    }
}