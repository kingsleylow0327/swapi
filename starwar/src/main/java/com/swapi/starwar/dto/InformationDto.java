package com.swapi.starwar.dto;

import com.fasterxml.jackson.annotation.JsonGetter;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class InformationDto {

    private StarshipDto starship;

    private int crew;

    private Boolean isLeiaOnPlanet;

    @JsonGetter
    public Map<String, Object> getStarship(){
        return starship == null? new HashMap<>() : starship.toMap();
    }
}
