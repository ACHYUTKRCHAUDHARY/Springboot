package org.example.spring2.controller;

import lombok.RequiredArgsConstructor;
import org.example.spring2.dto.AddStudentRequestDto;
import org.example.spring2.dto.StudentDto;
import org.example.spring2.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService  studentService;

    /**
     * over here bean of the student repository is injected
     * @param studentRepository
     *  public StudentController(StudentRepository studentRepository) {
     *         this.studentRepository = studentRepository;
     *     }
     *     in the controller section we are try to put only dto and service
     */


    @GetMapping
    /**
     * in the controller always dto goes inside
     * this is for the trial purpose only
     */
    public ResponseEntity<List<StudentDto>> getStudent() {
        return ResponseEntity.ok(studentService.getAllStudent());
    }

//    @GetMapping("/student/{id}/{name}")
//    public String getStudentById(@PathVariable("id") Long id,
//                                     @PathVariable String name) {
//        return "path vaiable "+id+"name "+name;
//    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDto> addStudent(@RequestBody AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(studentService.createNewStudent(addStudentRequestDto));
    }

    @DeleteMapping("/{id")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Long id){
        studentService.deleteByStudentId(id);
        return ResponseEntity.noContent().build();
    }
}
