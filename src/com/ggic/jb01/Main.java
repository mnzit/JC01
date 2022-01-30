package com.ggic.jb01;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // writeObject();
        readObject();
    }

    public static void readObject() {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("student.obj"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (Exception exception) {
            System.out.println("Exception: " + exception);
        }
    }

    public static void writeObject() {
        Student student = new Student(1L, "Jabir", true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("student.obj"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception exception) {
            System.out.println("Exception: " + exception);
        }
    }
}
