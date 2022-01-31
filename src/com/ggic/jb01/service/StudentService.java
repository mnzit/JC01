package com.ggic.jb01.service;

import com.ggic.jb01.model.Student;
import com.ggic.jb01.dao.StudentMemory;

import java.util.List;

public class StudentService {

    private StudentMemory studentMemory = new StudentMemory();

    public void save(Student student) {
        if (student != null) {
            studentMemory.save(student);
        }else{
            throw new RuntimeException("Cannot save null value");
        }
    }

    public Student findById(Long id) {
        Student student = studentMemory.findById(id);
        if (student == null) {
            throw new RuntimeException("Student not found");
        }
        return student;
    }

    public List<Student> findAll() {
        List<Student> list = studentMemory.list();
        if(list != null && !list.isEmpty()){
            return list;
        }else{
            throw new RuntimeException("Students not found");
        }
    }
}
