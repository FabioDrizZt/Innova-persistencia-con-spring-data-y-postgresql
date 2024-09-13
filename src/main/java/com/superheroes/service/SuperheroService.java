package com.superheroes.service;

import com.superheroes.entity.Superhero;
import com.superheroes.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroService {
    @Autowired
    private SuperheroRepository superheroRepository;

    public List<Superhero> findAll(){
        return superheroRepository.findAll();
    }
    public Superhero findById(Long id){
        return superheroRepository.findById(id).orElse(null);
    }
    public Superhero save(Superhero superhero){
        return superheroRepository.save(superhero);
    }
    public void delete(Long id){
        superheroRepository.deleteById(id);
    }
}
