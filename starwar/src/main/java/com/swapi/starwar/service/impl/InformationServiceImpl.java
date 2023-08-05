package com.swapi.starwar.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.swapi.starwar.dto.InformationDto;
import com.swapi.starwar.entity.Information;
import com.swapi.starwar.repository.InformationRepository;
import com.swapi.starwar.service.InformationService;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    InformationRepository informationRepository;

    @Override
    public ResponseEntity<InformationDto> getInformation(String name) {
        Information information = informationRepository.getByName(name).
            orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("%s is not registered on the planet", name)));
        InformationDto responseDto = information.toDto();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

}
