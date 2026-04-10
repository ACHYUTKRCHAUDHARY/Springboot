package org.example.spring2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
    @Id
    /**
     * this generatedvalue will automatically generate the value in the db
     * this class is used to make the entity table in the database
     * [
     * {}
     * ]
     * is there field like this happens cause when there is data in the table
     * but there not able to retrieve the data cause every thing is private ,
     * therefore we use getter and setter to list the row in these fields
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
