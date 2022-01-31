package com.ggic.jb01;

import com.ggic.jb01.controller.StudentController;
import com.ggic.jb01.enums.Action;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter action you want to do with student");
            studentController.process(Action.valueOf(scanner.next()));
        }

    }
}
