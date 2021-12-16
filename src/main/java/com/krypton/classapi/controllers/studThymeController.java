package com.krypton.classapi.controllers;

import com.krypton.classapi.entities.Student;
import com.krypton.classapi.services.classService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class studThymeController {
    @Autowired
    classService service;

    @GetMapping("/th/{grade}")
    public Object getStudentsByName(@PathVariable String grade, Model model) {
        List<Student> students = service.getByGrade(grade);
        model.addAttribute("data", students);
        return "thyme.html";
    }
}
