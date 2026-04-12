package org.example.spring2.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring2.dto.AddStudentRequestDto;
import org.example.spring2.dto.StudentDto;
import org.example.spring2.entity.Student;
import org.example.spring2.repository.StudentRepository;
import org.example.spring2.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * service annotations tells that we have to write the business logic
 * this class will talk with peristence layer
 * jaha par bhi final,private likha hai waha par @RequiredArgsConstructor
 * constructor
 * bana dega
 * creating an object on regular basis and automatically map the object that
 * iswhy modelmapper library is used
 * in the model mapper paramter we make sure that the two class have the same
 * fields
 * get means body return karne waqt -200
 * post ->201
 * delete means no body return 204
 */
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<StudentDto> getAllStudent() {
        List<Student> students = studentRepository.findAll();

         return students
                .stream()
                .map(student -> modelMapper.map(student,StudentDto.class
                ))
                .toList();
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student=
                studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("student not found with ID: "+id));
        return modelMapper.map(student, StudentDto.class);

    }

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
        Student newStudent=modelMapper.map(addStudentRequestDto, Student.class);
        Student student =studentRepository.save(newStudent);
        return modelMapper.map(student,StudentDto.class);
    }

    @Override
    public void deleteByStudentId(Long id) {
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("student not found with ID: "+id);
        }
        else {
            studentRepository.deleteById(id);
        }
    }

    @Override
    public StudentDto updateStudent(Long id,
                                    AddStudentRequestDto addStudentRequestDto) {
        Student student=studentRepository
                .findById(id)
                .orElseThrow(()-> new IllegalArgumentException("student not found with ID: "+id));

        modelMapper.map(addStudentRequestDto,student);

        student =studentRepository.save(student);
        return modelMapper.map(student,StudentDto.class);
    }


}
