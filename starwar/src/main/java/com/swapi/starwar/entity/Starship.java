package com.swapi.starwar.entity;

import com.swapi.starwar.dto.StarshipDto;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Starship {

    @Id
    private Long id;

    private String name;

    @Column(name = "class")
    private String classes;

    private String model;

    public StarshipDto toDto() {
        StarshipDto dto = new StarshipDto();
        dto.setName(this.getName());
        dto.setClasses(this.getClasses());
        dto.setModel(this.getModel());
        return dto;
    }
}
