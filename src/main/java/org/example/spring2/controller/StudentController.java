package org.example.spring2.controller;

import org.example.spring2.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent() {
        return new Student(4,"Achyut",achyutchaudhary@gmail.com);
    }
}
