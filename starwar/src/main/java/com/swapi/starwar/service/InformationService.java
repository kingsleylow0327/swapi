package com.swapi.starwar.service;
import org.springframework.http.ResponseEntity;

import com.swapi.starwar.dto.InformationDto;

public interface InformationService {

    ResponseEntity<InformationDto> getInformation(String name);
    
}
