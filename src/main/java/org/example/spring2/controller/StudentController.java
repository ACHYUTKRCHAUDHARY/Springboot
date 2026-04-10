package org.example.spring2.controller;

import org.example.spring2.dto.Studentdto;
import org.example.spring2.entity.Student;
import org.example.spring2.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    /**
     * over here bean of the student repository is injected
     * @param studentRepository
     */
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    /**
     * in the controller always dto goes inside
     * this is for the trial purpose only
     */
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public Studentdto  getStudentById(){
        return new Studentdto(4L,"Achyut","achyutchaudhary@gmail.com");
    }

}
