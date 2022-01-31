package com.ggic.jb01.controller;

import com.ggic.jb01.enums.Action;
import com.ggic.jb01.model.Student;
import com.ggic.jb01.service.StudentService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StudentController {

    private StudentService studentService = new StudentService();
    private Student student = null;
    private List<Student> students = null;
    private Long id;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void save() throws Exception {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter your Id");
        student.setId(scanner.nextLong());
        System.out.println("Enter your Name");
        student.setName(scanner.next());
        System.out.println("Enter your Address");
        student.setAddress(scanner.next());
        System.out.println("Enter your Contact");
        student.setContactNo(scanner.next());
        System.out.println("Enter your DOB in dd/MM/yyyy");
        student.setDob(new SimpleDateFormat("dd/MM/yyyy").parse(scanner.next()));

        studentService.save(student);
        System.out.println("Student saved successfully");
    }

    public void view() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Student Id");
        id = scanner.nextLong();
        Student student = studentService.findById(id);
        System.out.println(student);
    }

    public void viewAll() {
        List<Student> students = studentService.findAll();
        System.out.println(students);
    }

    public void process(Action action) {
        try {
            switch (action) {
                case SAVE:
                    save();
                    break;
                case VIEW:
                    view();
                    break;
                case VIEW_ALL:
                    viewAll();
                    break;
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
