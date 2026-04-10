package org.example.spring2.controller;

import org.example.spring2.dto.Studentdto;
import org.example.spring2.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Studentdto> getStudent() {
        return new Studentdto(4L,"Achyut","achyutchaudhary@gmail.com");
    }

    @GetMapping("/student/{id}")
    public Studentdto  getStudentById(){
        return new Studentdto(4L,"Achyut","achyutchaudhary@gmail.com");
    }

}
