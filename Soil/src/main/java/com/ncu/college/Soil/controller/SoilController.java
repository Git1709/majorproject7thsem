package com.ncu.college.Soil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ncu.college.Soil.dto.SoilDto;
import com.ncu.college.Soil.service.SoilService;

@RequestMapping("/Soils")
@RestController
public class SoilController {

    private final SoilService _SoilService;

    @Autowired
    SoilController(SoilService soilService) {
        this._SoilService = soilService;
    }
//-----------------------------------------------------

    @GetMapping(path = "/allSoil")
// at http://localhost:8081/Soils/allSoil/''
//    http://localhost:8081/Soils/allSoil
    public List<SoilDto> getAllSoil() {

        return _SoilService.GetAllSoils();

    }

    @GetMapping("/byName")
    public String getSoilByName(@RequestParam("name") String soilName) {
        System.out.println("Looking up soil: " + soilName);
        return "This is soil: " + soilName;
    }//http://localhost:8081/Soils/byName?name=NIGGER 
}
