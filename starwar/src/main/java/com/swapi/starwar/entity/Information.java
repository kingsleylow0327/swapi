package com.swapi.starwar.entity;

import com.swapi.starwar.dto.InformationDto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Information {

    @Id
    private Long id;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private Starship starship;

    private int crew;

    private Boolean isLeiaOnPlanet;

    private String name;

    public InformationDto toDto() {
        InformationDto dto = new InformationDto();
        if (this.getStarship() != null) {
            dto.setStarship(this.getStarship().toDto());
        }
        dto.setCrew(this.getCrew());
        dto.setIsLeiaOnPlanet(this.getIsLeiaOnPlanet());
        return dto;
    }
}
