package com.swapi.starwar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swapi.starwar.entity.Information;


public interface InformationRepository extends JpaRepository<Information, Long>{

    public Optional<Information> getByName(String name);
    
}
