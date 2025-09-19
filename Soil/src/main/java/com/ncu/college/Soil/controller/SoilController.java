package com.ncu.college.Soil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ncu.college.Soil.dto.SoilDto;
import com.ncu.college.Soil.service.SoilService;

@RequestMapping("/Soils")
@RestController
public class SoilController {

    private final SoilService soilService;

    @Autowired
    SoilController(SoilService soilService) {
        this.soilService = soilService;
    }

    // GET all soils
    @GetMapping("/all")
    public List<SoilDto> getAllSoil() {
        return soilService.GetAllSoils();
    }

    @GetMapping("/byName")
    public String getSoilByName(@RequestParam("name") String soilName) {
        System.out.println("Looking up soil: " + soilName);
        return "This is soil: " + soilName;
    }//http://localhost:8081/Soils/byName?name=NIGGER }
    // GET soil by ID

    @GetMapping("/{id}")
    public SoilDto getSoilById(@PathVariable int id) {
        return soilService.GetSoilById(id);
    }

    // POST create soil
    @PostMapping("/add")
    public String addSoil(@RequestBody SoilDto dto) {
        int result = soilService.AddSoil(dto);
        return result > 0 ? "Soil added successfully" : "Error inserting soil";
    }

    // PUT update soil
    @PutMapping("/update/{id}")
    public String updateSoil(@PathVariable int id, @RequestBody SoilDto dto) {
        int result = soilService.UpdateSoil(dto, id);
        return result > 0 ? "Soil updated successfully" : "Error updating soil";
    }

    // DELETE soil
    @DeleteMapping("/delete/{id}")
    public String deleteSoil(@PathVariable int id) {
        int result = soilService.DeleteSoil(id);
        return result > 0 ? "Soil deleted successfully" : "Error deleting soil";
    }
}
