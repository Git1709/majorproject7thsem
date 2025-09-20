package com.ncu.college.Soil.controller;

import com.ncu.college.Soil.dto.SoilAdminDto;
import com.ncu.college.Soil.service.SoilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Admin/Soils")
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
