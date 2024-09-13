package com.superheroes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Superhero {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String superPower;
    private String city;
}
