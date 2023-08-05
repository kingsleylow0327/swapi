package com.swapi.starwar.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swapi.starwar.dto.InformationDto;
import com.swapi.starwar.service.InformationService;


@RestController
@Validated
public class InformationController {
    
    @Autowired
    InformationService informationService;

    @GetMapping("/information")
    public ResponseEntity<InformationDto> getInformation(@NonNull @RequestParam(name = "name") String name) {
        return informationService.getInformation(name);
    }
}
