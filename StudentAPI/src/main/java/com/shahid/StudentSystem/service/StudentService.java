package com.shahid.StudentSystem.service;

import com.shahid.StudentSystem.model.Student;
import com.shahid.StudentSystem.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class StudentService{

    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student) throws IOException {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

}
