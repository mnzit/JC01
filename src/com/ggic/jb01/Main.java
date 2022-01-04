package com.ggic.jb01;

import com.ggic.jb01.factory.PlayableFactory;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to play: ");
        String input = scanner.nextLine();
        Playable playable = PlayableFactory.produce(input);
        playable.play();
    }
}