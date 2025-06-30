package com.iut.firstclassone.controllers;

import com.iut.firstclassone.models.entity.Student;
import com.iut.firstclassone.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping("/getAllstudents")
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @PostMapping("/addNewStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.save(student);
    }
    @GetMapping("/getStudentById")
    public Student getStudentById(Long id) {
        return studentService.findOne(id);
    }
}