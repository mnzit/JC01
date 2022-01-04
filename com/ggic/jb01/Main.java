package com.ggic.jb01;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import com.ggic.jb01.ball.Basketball;
import com.ggic.jb01.ball.Football;
import com.ggic.jb01.factory.PlayableFactory;

public class Main {


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ke : ");
        String input = scanner.nextLine();
        System.out.println("Input: "+ input);
        Playable playable = PlayableFactory.produce(input);
        playable.play();
    }   

}