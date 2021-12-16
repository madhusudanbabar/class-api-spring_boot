package com.krypton.classapi.controllers;


import com.krypton.classapi.entities.Student;
import com.krypton.classapi.interfaces.Repo;
import com.krypton.classapi.services.classService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentsController {

    @Autowired
    classService service;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.getAll();
    }

    @GetMapping("/students/grades/{grade}")
    public List<Student> getStudentsByGrade(@PathVariable String grade) {
        return service.getByGrade(grade);
    }

    @GetMapping("/students/streams/{stream}")
    public List<Student> getStudentsByStream(@PathVariable String stream){
        return service.getByStream(stream);
    }

    @GetMapping("/students/count/{stream}")
    public int countStudentsByStream(@PathVariable String stream) {
        return service.getCountByStream(stream);
    }



}
