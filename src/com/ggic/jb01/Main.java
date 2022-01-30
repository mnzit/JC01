package com.ggic.jb01;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        File file = new File("folder1" + File.separator + "students.txt");
        writeStudents(file);
        readStudents(file);
    }


    public static void writeStudents(File file) {
        try {
            String input = "";
            while ((input = new Scanner(System.in).nextLine()) != null) {
                if (!input.equals("Q")) {
                    FileWriter fileWriter = new FileWriter(file, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.append(input);
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                    fileWriter.close();
                }else{
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void readStudents(File file) {
        try {

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<Student> students = bufferedReader
                    .lines()
                    .filter(s -> s != null && s.trim().length() > 0)
                    .map(s -> s.split(","))
                    .filter(s -> s[0] != null && s[1] != null && s[2] != null)
                    .map(s -> new Student(Long.parseLong(s[0]), s[1], Boolean.parseBoolean(s[2])))
                    .collect(Collectors.toList());

            fileReader.close();
            bufferedReader.close();
            System.out.println(students);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
