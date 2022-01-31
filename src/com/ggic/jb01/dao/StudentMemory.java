package com.ggic.jb01.dao;

import com.ggic.jb01.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMemory {

    private List<Student> list = new ArrayList<>();
    private Map<Long, Student> search = new HashMap<>();

    public void save(Student student) {
        list.add(student);
        search.put(student.getId(), student);
    }

    public List<Student> list() {
        return list;
    }

    public Student findById(Long id) {
        return search.get(id);
    }
}
