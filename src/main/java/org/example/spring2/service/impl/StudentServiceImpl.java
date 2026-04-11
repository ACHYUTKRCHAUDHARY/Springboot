package org.example.spring2.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring2.dto.StudentDto;
import org.example.spring2.entity.Student;
import org.example.spring2.repository.StudentRepository;
import org.example.spring2.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * service annotations tells that we have to write the business logic
 * this class will talk with peristence layer
 * jaha par bhi final,private likha hai waha par @RequiredArgsConstructor
 * constructor
 * bana dega
 */
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    @Override
    public List<StudentDto> getAllStudent() {
        List<Student> students = studentRepository.findAll();

        List<StudentDto> studentDtoList = students
                .stream()
                .map(student -> new StudentDto(
                        student.getId(),
                        student.getName(),
                        student.getEmail()
                ))
                .toList(); //
        return List.of();
    }
}
