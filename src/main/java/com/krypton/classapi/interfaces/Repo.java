package com.krypton.classapi.interfaces;

import com.krypton.classapi.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<Student, Integer> {
    public List<Student> findByStream(String stream);
    public List<Student> findByGrade(String grade);
    public List<Student> findByName(String name);
    public int countByStream(String stream);
//    public List<Student> findByStreamAndGradeIn(String stream, String grade1, String grade2);
}
