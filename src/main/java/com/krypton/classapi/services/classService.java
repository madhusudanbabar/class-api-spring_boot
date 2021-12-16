package com.krypton.classapi.services;

import com.krypton.classapi.entities.Student;
import com.krypton.classapi.interfaces.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class classService {

    @Autowired
    Repo repo;

    public Student getById(int id) {
        return repo.findById(id).get();
    }

    public List<Student> getByStream(String stream){
        return repo.findByStream(stream);
    }

    public List<Student> getByGrade(String grade) {
        return repo.findByGrade(grade);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public int getCountByStream(String stream) {
        return repo.countByStream(stream);
    }

    public List<Student> getByStudentName(String name) {
        return repo.findByName(name);
    }
}
