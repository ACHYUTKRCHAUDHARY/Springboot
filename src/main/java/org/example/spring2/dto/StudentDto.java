package org.example.spring2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * data annotation is used to for the bringing/creating the data from the getter
 * setter and constructor and hashcode
 * AllArgsConstructor is used to create the constructor with all the arguments
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    public String email;
}
