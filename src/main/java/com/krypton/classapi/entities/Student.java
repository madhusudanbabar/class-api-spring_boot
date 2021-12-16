package com.krypton.classapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {

    @Id
    @Column(name = "studentId")
    int id;

    @Column(name = "studentName")
    String name;

    @Column(name = "stream")
    String stream;

    @Column(name = "grade")
    String grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student() {
    }

    public Student(String name, String stream, String grade) {
        this.name = name;
        this.stream = stream;
        this.grade = grade;
    }
}
