package com.shahid.StudentSystem.controller;

import com.shahid.StudentSystem.model.Student;
import com.shahid.StudentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody
    Student student){
        try {
            Student s1 = studentService.addStudent(student);
            return new ResponseEntity<>(s1, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping()
    public ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<List<Student>>(studentService.getAllStudent(),HttpStatus.OK);
    }

}