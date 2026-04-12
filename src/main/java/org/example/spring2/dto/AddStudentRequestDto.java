package org.example.spring2.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentRequestDto {
    @NotBlank(message = "Name is required")
    @Size(min=3,max=30,message = "Name should be of length 3 to 30")
    private String name;
    @Email
    @NotBlank(message ="Email is required")
    public String email;
}


