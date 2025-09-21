package com.ncu.college.Soil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncu.college.Soil.dto.SoilAdminDto;
import com.ncu.college.Soil.service.SoilService;

@RequestMapping("/admin/soils")
@RestController
public class SoilAdminController {

    private final SoilService soilService;

    @Autowired
    SoilAdminController(SoilService soilService) {
        this.soilService = soilService;
    }

    // GET all soils with ID
    @GetMapping("/all")
    public List<SoilAdminDto> getAllSoilsWithId() {
        return soilService.GetAllSoilsWithId();
    }

    // GET soil by ID with ID field included
    @GetMapping("/{id}")
    public SoilAdminDto getSoilByIdWithId(@PathVariable int id) {
        return soilService.GetSoilByIdWithId(id);
    }
}
