package org.example.spring2.controller;

import lombok.RequiredArgsConstructor;
import org.example.spring2.dto.StudentDto;
import org.example.spring2.entity.Student;
import org.example.spring2.repository.StudentRepository;
import org.example.spring2.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    /**
     * over here bean of the student repository is injected
     * @param studentRepository
     *  public StudentController(StudentRepository studentRepository) {
     *         this.studentRepository = studentRepository;
     *     }
     *     in the controller section we are try to put only dto and service
     */


    @GetMapping("/student")
    /**
     * in the controller always dto goes inside
     * this is for the trial purpose only
     */
    public List<Student> getStudent() {
        return studentService.getAllStudent();
    }

//    @GetMapping("/student/{id}/{name}")
//    public String getStudentById(@PathVariable("id") Long id,
//                                     @PathVariable String name) {
//        return "path vaiable "+id+"name "+name;
//    }

    @GetMapping("/student/{id}")
    public

}
