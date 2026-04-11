package org.example.spring2.service;

import org.example.spring2.dto.AddStudentRequestDto;
import org.example.spring2.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudent();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
}
