package com.swapi.starwar.dto;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class StarshipDto {

    private String name;

    private String classes;

    private String model;

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("class", classes);
        map.put("model", model);
        return map;
    }
}
