package org.example.spring2.service;

import org.example.spring2.dto.AddStudentRequestDto;
import org.example.spring2.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudent();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteByStudentId(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
